#!/bin/sh
# Script to deploy demos to gh-pages branch.
#
# @usage:
#   $ git checkout scripts
#   $ sh bin/deploy_demo.sh
#
# You need right access to gwt-polymer-elements project in github
#
# @author: Manolo Carrasco <manolo@vaadin.com>
#

# exit in case of failure
set -x -e

# Verify that we dont have anything to commit and change to master
git diff --quiet || exit 1
git checkout master

[ ! -f demo/pom.xml ] && exit 2

# Run script to generate pom and java stuff
rm -rf pom.xml src node_modules pom.xml.releaseBackup release.properties target
npm install

# Compile demo using compiled library
(cd demo && mvn clean package)


# Save application
( cd demo/target/gwt-polymer-demo/ && \
  tar cf /tmp/demo.tar demo.* gwt* img )

# Save apidocs
( cd demo/target/apidocs/ && \
  tar cf /tmp/api.tar * )

# Switch to gh-pages and update demo compiled app
git checkout gh-pages

( cd demo && \
  rm -rf gwt* && \
  tar xf /tmp/demo.tar )

( cd api && \
  rm * && \
  tar xf /tmp/api.tar )

# Create an index
cp demo/demo.html demo/index.html

# Commit changes to gh-pages
git add demo/gwt* 
git add api/* 
#git commit -m 'Update demo' demo
#git push origin gh-pages

# Return to master branch
git checkout master
