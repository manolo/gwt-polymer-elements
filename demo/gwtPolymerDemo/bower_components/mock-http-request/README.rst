MockHttpRequest
===============

This JavaScript module provides a mock implementation of
XMLHttpRequest_ for unit testing.  In nearly all ways it behaves like
a regular XMLHttpRequest_ (with support for `Progress Events`_),
except of course it doesn't open a network connection.  Instead it
exposes the relevant data through the following extra attributes and
methods:

``method``, ``url``, ``async``, ``user``, ``password``
    These attributes correspond to the arguments of the ``open()``
    method.

``urlParts``
    Object representing individual parts of the URL passed to
    ``open()``, e.g. ``protocol``, ``host``, ``port``, ``path``,
    ``query``, ``anchor``.  If present, the query string (``query``)
    is parsed and its elements are available from the ``queryKey``
    property.

``requestText``
    This attribute will contain the request body that was passed to
    the ``send()`` method.

``getRequestHeader(header)``
    Returns a request header set by the client.

``setResponseHeader(header, value)``
    Sets a response header.  This should be called before calling the
    ``receive()`` method.

``receive(status, data)``
    Send data back to the client.  ``status`` is an integer
    representing the HTTP status code (e.g. 200) and data is the
    response body (string).

``err(exception)``
    Simulate a request error, such as ``NETWORK_ERR``.

``authenticate(user, password)``
    Verify HTTP credentials passed to ``open()``, inserted into the
    URL, or sent via the ``Authorization`` header (in that order).


Simple example
--------------

Let's look at a brief example.  Imagine you have this piece of code
that wants to make an AJAX connection::

  $ var request = new MockHttpRequest();
  $ request.open("POST", "http://some.host/path");
  $ request.setRequestHeader("Content-Type", "application/robot");
  $ request.onload = function () {
  >     print("Received response: " + this.statusText);
  >     print("Response body: " + this.responseText);
  > };
  $ request.send("Hey meatbag!");

The request data will be set accordingly::

  $ request.method
  "POST"
  $ request.url
  "http://some.host/path"
  $ request.async
  true

  $ request.requestText
  "Hey meatbag!"
  $ request.getRequestHeader("Content-Type")
  "application/robot"

We can now simulate sending data back to the client::

  $ request.receive(404, "Sorry, I have no idea what you're talking about.");
  Received response: 404 Not Found
  Response body: Sorry, I have no idea what you're talking about.


MockHttpServer for tests
------------------------

Often you can't just change the client code to use ``MockHttpRequest``
for tests.  In such cases, you can use ``MockHttpServer`` to intercept
all instances of ``XMLHttpRequest``.

For example, imagine you were trying to test a function called
``makeAJAXCall()`` that relied on getting information through
``XMLHttpRequest``.  First let's set up a server instance and define a
request handler in which we mimick the server application and return
whatever data the server would normally return::

  var server = new MockHttpServer();
  server.handle = function (request) {
      request.setResponseHeader("Content-Type", "application/robot");
      request.receive(200, "I am Bender, please insert girder!");
  };

Now we can switch on the "server" to divert all ``XMLHttpRequests`` to
our handler.  Then we call the function we want to test.  Finally we
must not forget to clean up by stopping the server::

  server.start();
  makeAJAXCall();
  server.stop();


About
-----

``MockHttpRequest`` was written by `Philipp von Weitershausen`_.  It is
released under the `MIT License`_.


.. _XMLHttpRequest: http://www.w3.org/TR/XMLHttpRequest
.. _Progress Events: http://www.w3.org/TR/progress-events/
.. _Philipp von Weitershausen: mailto:philipp@weitershausen.de
.. _MIT License: http://www.opensource.org/licenses/mit-license.php
