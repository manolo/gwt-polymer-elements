/**
 * Copyright 2016 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

// DO NOT EDIT THIS GENERATED OUTPUT DIRECTLY!
// This file should be overwritten as part of your build process.
// If you need to extend the behavior of the generated service worker, the best approach is to write
// additional code and include it using the importScripts option:
//   https://github.com/GoogleChrome/sw-precache#importscripts-arraystring
//
// Alternatively, it's possible to make changes to the underlying template file and then use that as the
// new base for generating output, via the templateFilePath option:
//   https://github.com/GoogleChrome/sw-precache#templatefilepath-string
//
// If you go that route, make sure that whenever you update your sw-precache dependency, you reconcile any
// changes made to this original template file with your modified copy.

// This generated service worker JavaScript will precache your site's resources.
// The code needs to be saved in a .js file at the top-level of your site, and registered
// from your pages in order to be used. See
// https://github.com/googlechrome/sw-precache/blob/master/demo/app/js/service-worker-registration.js
// for an example of how you can register this script and handle various service worker events.

/* eslint-env worker, serviceworker */
/* eslint-disable indent, no-unused-vars, no-multiple-empty-lines, max-nested-callbacks, space-before-function-paren, quotes, comma-spacing */
'use strict';

var precacheConfig = [["gwtPolymerDemo/bower_components/font-roboto/roboto.html","d41d8cd98f00b204e9800998ecf8427e"],["gwtPolymerDemo/bower_components/iron-a11y-announcer/iron-a11y-announcer.html","a7481abe4e739db811c2f50a50c0af3a"],["gwtPolymerDemo/bower_components/iron-a11y-keys-behavior/iron-a11y-keys-behavior.html","54c4fb4e39478fc1b6d09b4acbd0389a"],["gwtPolymerDemo/bower_components/iron-ajax/iron-ajax.html","2014ea7dc1d2d417afa9f488cff74382"],["gwtPolymerDemo/bower_components/iron-ajax/iron-request.html","0a08085e796bed6171caef37a6b12257"],["gwtPolymerDemo/bower_components/iron-autogrow-textarea/iron-autogrow-textarea.html","6134b66684578bc02e9d4d8e60047481"],["gwtPolymerDemo/bower_components/iron-behaviors/iron-button-state.html","75da1ac0ca8d191caa798a65ec5a4c8b"],["gwtPolymerDemo/bower_components/iron-behaviors/iron-control-state.html","c05daf791e449749c5268bd95ec626aa"],["gwtPolymerDemo/bower_components/iron-checked-element-behavior/iron-checked-element-behavior.html","42c03c616d99e540b9ca824154d02d89"],["gwtPolymerDemo/bower_components/iron-collapse/iron-collapse.html","83adac3630822df246fb06e817208083"],["gwtPolymerDemo/bower_components/iron-dropdown/iron-dropdown-scroll-manager.html","5d39bff35832df14a1875cf876a42320"],["gwtPolymerDemo/bower_components/iron-dropdown/iron-dropdown.html","d00a208842af04e449fb011f68aac6a1"],["gwtPolymerDemo/bower_components/iron-fit-behavior/iron-fit-behavior.html","37ce09284fd9db0a2f73fe2684442c35"],["gwtPolymerDemo/bower_components/iron-flex-layout/classes/iron-flex-layout.html","533766b209c5e3d1957117204c312241"],["gwtPolymerDemo/bower_components/iron-flex-layout/classes/iron-shadow-flex-layout.html","c880e8f5354c298f0404530ab0cff0d9"],["gwtPolymerDemo/bower_components/iron-flex-layout/iron-flex-layout.html","151308b528090fb6c76b74d8943aa0b0"],["gwtPolymerDemo/bower_components/iron-form-element-behavior/iron-form-element-behavior.html","8ffdd1ce0a492d317776bb1bb4a443a0"],["gwtPolymerDemo/bower_components/iron-icon/iron-icon.html","d0fdbd53c2fd32d006fed39a245e43aa"],["gwtPolymerDemo/bower_components/iron-icons/av-icons.html","7ddc624b73101033c72e95f2d138fb32"],["gwtPolymerDemo/bower_components/iron-icons/communication-icons.html","f5d3567b8b566cd0f4e6044142ec4367"],["gwtPolymerDemo/bower_components/iron-icons/device-icons.html","3f45536976ee6acc3511387bc971927c"],["gwtPolymerDemo/bower_components/iron-icons/editor-icons.html","966f59875767c28d63e85109f72342b7"],["gwtPolymerDemo/bower_components/iron-icons/hardware-icons.html","3a47896ccd2f6001ac02b1af558df06f"],["gwtPolymerDemo/bower_components/iron-icons/image-icons.html","f8a35791c75944606e49d9c905630a6b"],["gwtPolymerDemo/bower_components/iron-icons/iron-icons.html","4d452f51b8128ca8daa6f19dd5863f89"],["gwtPolymerDemo/bower_components/iron-icons/maps-icons.html","6e9b1f0fc963de60dd8ab8d3f35897ce"],["gwtPolymerDemo/bower_components/iron-icons/notification-icons.html","17bd1a49aa9ba1e4ee871e38b62a585d"],["gwtPolymerDemo/bower_components/iron-icons/social-icons.html","e368d3300eca0228f9684f7f88d5aaaa"],["gwtPolymerDemo/bower_components/iron-iconset-svg/iron-iconset-svg.html","55831730a9aaa8d8a44525f7cee17e7e"],["gwtPolymerDemo/bower_components/iron-image/iron-image.html","768e2931f28395e8445cdd0add3c7147"],["gwtPolymerDemo/bower_components/iron-input/iron-input.html","c9258caa5be1130df21efa8963b8bec2"],["gwtPolymerDemo/bower_components/iron-list/iron-list.html","59a6426a49596303a28802592fe9ffaf"],["gwtPolymerDemo/bower_components/iron-media-query/iron-media-query.html","0716c876740cd1225cfc060109c4f1d9"],["gwtPolymerDemo/bower_components/iron-menu-behavior/iron-menu-behavior.html","eb559df26fff29875fd0c65fc5b2dc51"],["gwtPolymerDemo/bower_components/iron-menu-behavior/iron-menubar-behavior.html","59f6e848e328387b68497b4860f8e57f"],["gwtPolymerDemo/bower_components/iron-meta/iron-meta.html","7c6822b1fb9f3b07ca501087b0feda2f"],["gwtPolymerDemo/bower_components/iron-overlay-behavior/iron-focusables-helper.html","ebd0502c5c28705b31ea836fbd4af9ab"],["gwtPolymerDemo/bower_components/iron-overlay-behavior/iron-overlay-backdrop.html","635b7d4f9584fdb8c7e2363b1d655ae3"],["gwtPolymerDemo/bower_components/iron-overlay-behavior/iron-overlay-behavior.html","02edc7cfd1fc63c6f5325c3beab07f4e"],["gwtPolymerDemo/bower_components/iron-overlay-behavior/iron-overlay-manager.html","39ab6a0dca8aa638e63bb7d995f5cb7f"],["gwtPolymerDemo/bower_components/iron-range-behavior/iron-range-behavior.html","2dc52b4a9306724f8b477d1e3125dbae"],["gwtPolymerDemo/bower_components/iron-resizable-behavior/iron-resizable-behavior.html","25120519f04d669b70a0b04c2615d0b9"],["gwtPolymerDemo/bower_components/iron-scroll-target-behavior/iron-scroll-target-behavior.html","cae5ff210ca8914381b5dd493824ba2e"],["gwtPolymerDemo/bower_components/iron-selector/iron-multi-selectable.html","e6100fe240603126deea4518f606821f"],["gwtPolymerDemo/bower_components/iron-selector/iron-selectable.html","50aae36e4a9fcaa3fd881b7a48bb2944"],["gwtPolymerDemo/bower_components/iron-selector/iron-selection.html","cc0797080a508370c26a7104a29433ca"],["gwtPolymerDemo/bower_components/iron-selector/iron-selector.html","c8946dcd397168b6ba3248f4ce7d0ca9"],["gwtPolymerDemo/bower_components/iron-validatable-behavior/iron-validatable-behavior.html","7ab1d3a5f460d0e87c3aa9fb4fcdfe00"],["gwtPolymerDemo/bower_components/mock-http-request/lib/mock.js","1c544ae76a94b50d65f59ee83a34a7cc"],["gwtPolymerDemo/bower_components/neon-animation/animations/cascaded-animation.html","4264aec50dd281cb6e7f62bd01190215"],["gwtPolymerDemo/bower_components/neon-animation/animations/fade-in-animation.html","3c3a01969d020450b7788e13c70e51a0"],["gwtPolymerDemo/bower_components/neon-animation/animations/fade-out-animation.html","79f5f1d31e76738b88ef6444e1092f3a"],["gwtPolymerDemo/bower_components/neon-animation/animations/hero-animation.html","4ec5066a78e31f2cd94d2ba9bd5a0045"],["gwtPolymerDemo/bower_components/neon-animation/animations/opaque-animation.html","84c54c14f65625c70dcec07d963bf9d5"],["gwtPolymerDemo/bower_components/neon-animation/animations/reverse-ripple-animation.html","d6b55f77e214fd8d86808a7eae1c569f"],["gwtPolymerDemo/bower_components/neon-animation/animations/ripple-animation.html","708cef7babbb3d590d0e3b3b79d4ebd1"],["gwtPolymerDemo/bower_components/neon-animation/animations/scale-down-animation.html","a056c366cfa5bb4754ab62249616521a"],["gwtPolymerDemo/bower_components/neon-animation/animations/scale-up-animation.html","d2baa2b3172131489de7f0f2d1fbcdcb"],["gwtPolymerDemo/bower_components/neon-animation/animations/slide-down-animation.html","1881f873fcb73ad6b922f8f2c9287739"],["gwtPolymerDemo/bower_components/neon-animation/animations/slide-from-bottom-animation.html","72bc94d5d55a1c382ac746f637ca6e93"],["gwtPolymerDemo/bower_components/neon-animation/animations/slide-from-left-animation.html","844be905520e21fe2762b8625c37af67"],["gwtPolymerDemo/bower_components/neon-animation/animations/slide-from-right-animation.html","5d09a38ec598910f13f6f3256fdb76bf"],["gwtPolymerDemo/bower_components/neon-animation/animations/slide-from-top-animation.html","10003b85c39c99a3463e2c3fef91ccc9"],["gwtPolymerDemo/bower_components/neon-animation/animations/slide-left-animation.html","737809376efa3d6725e096489d825f65"],["gwtPolymerDemo/bower_components/neon-animation/animations/slide-right-animation.html","8756f668f68c7cd94d3f7a2a225ca3bb"],["gwtPolymerDemo/bower_components/neon-animation/animations/slide-up-animation.html","b813a64d533448d17de5dd10bc593a71"],["gwtPolymerDemo/bower_components/neon-animation/animations/transform-animation.html","823f5b778660bee9e8e09098d876a4f7"],["gwtPolymerDemo/bower_components/neon-animation/neon-animatable-behavior.html","c4e34a9013a6e2c5838f716a8379b307"],["gwtPolymerDemo/bower_components/neon-animation/neon-animatable.html","7c7a79790d9473188f500c0e6315ea21"],["gwtPolymerDemo/bower_components/neon-animation/neon-animated-pages.html","773b85a798a514d6e5cdc005417c3bd3"],["gwtPolymerDemo/bower_components/neon-animation/neon-animation-behavior.html","bc8a36f87056e93701a9672a4313052b"],["gwtPolymerDemo/bower_components/neon-animation/neon-animation-runner-behavior.html","7373e1ae44fbf37121bbad2a9a6861b1"],["gwtPolymerDemo/bower_components/neon-animation/neon-animation.html","8c20deade545cc26334cd3ab5130c747"],["gwtPolymerDemo/bower_components/neon-animation/neon-animations.html","a0171c87c0fe88bdd8e270f1d1f39534"],["gwtPolymerDemo/bower_components/neon-animation/neon-shared-element-animatable-behavior.html","41b7fad8a9fa7702b3d3b1bbb615d59f"],["gwtPolymerDemo/bower_components/neon-animation/neon-shared-element-animation-behavior.html","d0aecc9a38e893e2f1843de0eecfc42d"],["gwtPolymerDemo/bower_components/neon-animation/web-animations.html","577638b27a2a77c751047a7b77cb49f2"],["gwtPolymerDemo/bower_components/paper-behaviors/paper-button-behavior.html","d881ed2793846b0b0918f1eb45ff193a"],["gwtPolymerDemo/bower_components/paper-behaviors/paper-checked-element-behavior.html","5e33a457606b1ac9703f9fd39ae49fdc"],["gwtPolymerDemo/bower_components/paper-behaviors/paper-inky-focus-behavior.html","577571a2641bd627cb10df0d87330441"],["gwtPolymerDemo/bower_components/paper-behaviors/paper-ripple-behavior.html","eb03adf1fddd6f8e71cfc12af8f8d3ba"],["gwtPolymerDemo/bower_components/paper-button/paper-button.html","1d481dc2b55f2e2fdd7a31fcd20a87f0"],["gwtPolymerDemo/bower_components/paper-checkbox/paper-checkbox.html","b2b86cd3ed3b86a842ca9329d5a1703a"],["gwtPolymerDemo/bower_components/paper-dialog-behavior/paper-dialog-behavior.html","f2bcfccbc746fcd64d030878ba1ce966"],["gwtPolymerDemo/bower_components/paper-dialog-behavior/paper-dialog-shared-styles.html","c5cec4595c6ec37c76184234216ce38f"],["gwtPolymerDemo/bower_components/paper-dialog-scrollable/paper-dialog-scrollable.html","604725e4fc7a2b490f1ad69a2432650c"],["gwtPolymerDemo/bower_components/paper-dialog/paper-dialog.html","16b1f2f8f2ddbe2a22a18239313e3e01"],["gwtPolymerDemo/bower_components/paper-drawer-panel/paper-drawer-panel.html","25cb60cf509023fd4c88490465964dac"],["gwtPolymerDemo/bower_components/paper-dropdown-menu/paper-dropdown-menu-icons.html","77ee118694dd98504ff4ebb31873455f"],["gwtPolymerDemo/bower_components/paper-dropdown-menu/paper-dropdown-menu-shared-styles.html","b9cfe91cf6cc5f73758d7c780168f828"],["gwtPolymerDemo/bower_components/paper-dropdown-menu/paper-dropdown-menu.html","0345f7161b3f11953d251d9d3b1b5799"],["gwtPolymerDemo/bower_components/paper-fab/paper-fab.html","77a6ed8fe828072b60b73d04a5600e01"],["gwtPolymerDemo/bower_components/paper-header-panel/paper-header-panel.html","c444f3d7600746e6599c27fc1027e99f"],["gwtPolymerDemo/bower_components/paper-icon-button/paper-icon-button.html","b45294833b61afa7c064f103946e0616"],["gwtPolymerDemo/bower_components/paper-input/paper-input-addon-behavior.html","92fe877f9231f09bcde5b2298dc0536c"],["gwtPolymerDemo/bower_components/paper-input/paper-input-behavior.html","a08bc3bd30d52e1583e158dad185cbd1"],["gwtPolymerDemo/bower_components/paper-input/paper-input-char-counter.html","0e7fabfb78a0740fb3887dff8b032496"],["gwtPolymerDemo/bower_components/paper-input/paper-input-container.html","714fe3632a33a0a771a260298a63fced"],["gwtPolymerDemo/bower_components/paper-input/paper-input-error.html","47e38ab875f7bf6ca03648842f99d10d"],["gwtPolymerDemo/bower_components/paper-input/paper-input.html","d714836b0a66495e625dc9050833c324"],["gwtPolymerDemo/bower_components/paper-input/paper-textarea.html","d505ed5b41fa30e971f20c12760e6f26"],["gwtPolymerDemo/bower_components/paper-item/all-imports.html","3e8b391e3231bf46fa6b7e6e1311b3a9"],["gwtPolymerDemo/bower_components/paper-item/paper-icon-item.html","3e178577f33aa347e669100e6fa1f713"],["gwtPolymerDemo/bower_components/paper-item/paper-item-behavior.html","0d347fdd78663fcfe74e44ac9897035f"],["gwtPolymerDemo/bower_components/paper-item/paper-item-body.html","c3dd432e0a2a14bf39ff3fd0df63dd43"],["gwtPolymerDemo/bower_components/paper-item/paper-item-shared-styles.html","04605960aa51d182c0754e2e77a16c9e"],["gwtPolymerDemo/bower_components/paper-item/paper-item.html","9ad26ee7aa203863b3a4ee725def342a"],["gwtPolymerDemo/bower_components/paper-material/paper-material-shared-styles.html","69c1aafd30b9710e1f852fd677907bf8"],["gwtPolymerDemo/bower_components/paper-material/paper-material.html","3c53783a2f03a21a4e56ff2548a841dd"],["gwtPolymerDemo/bower_components/paper-menu-button/paper-menu-button-animations.html","6e412a3c49f25933dba26828a455078a"],["gwtPolymerDemo/bower_components/paper-menu-button/paper-menu-button.html","7b8a71278d0cc4418032d8a3ca399f7d"],["gwtPolymerDemo/bower_components/paper-menu/paper-menu-shared-styles.html","1578fe7775f8a21117104aee7342b7fc"],["gwtPolymerDemo/bower_components/paper-menu/paper-menu.html","792cd3fce5f7d39354d78f7c663e32b7"],["gwtPolymerDemo/bower_components/paper-progress/paper-progress.html","fb2ba12e2cdfd619d71da197baa358ca"],["gwtPolymerDemo/bower_components/paper-radio-button/paper-radio-button.html","91bfcdeafdccf8f958354260c77adfc1"],["gwtPolymerDemo/bower_components/paper-radio-group/paper-radio-group.html","9151c2c7dbc84dc5a601dfd4726ae8b1"],["gwtPolymerDemo/bower_components/paper-ripple/paper-ripple.html","fec422b0e1275430809da68cc7c95fc5"],["gwtPolymerDemo/bower_components/paper-slider/paper-slider.html","d6e7646d0614c15c2934e3472061efc0"],["gwtPolymerDemo/bower_components/paper-spinner/paper-spinner-behavior.html","a431fd7eb5693b8f0b268d6df8f52e44"],["gwtPolymerDemo/bower_components/paper-spinner/paper-spinner-styles.html","fed04e6699c68c1deb8c0ac06c24613e"],["gwtPolymerDemo/bower_components/paper-spinner/paper-spinner.html","83bd4168eace97805c0a1fc16124f0d1"],["gwtPolymerDemo/bower_components/paper-styles/color.html","c416d52e3dddcb9259e7ffa65c829bcf"],["gwtPolymerDemo/bower_components/paper-styles/default-theme.html","4c77bbaac8b5b7f92e93286609a5debd"],["gwtPolymerDemo/bower_components/paper-styles/demo-pages.html","579e044c549f136283213044069c4181"],["gwtPolymerDemo/bower_components/paper-styles/paper-styles.html","116f49145f929f7317e9ab63b5e8f8bd"],["gwtPolymerDemo/bower_components/paper-styles/shadow.html","2d664cdbcf148ced8806d53f7679b3a4"],["gwtPolymerDemo/bower_components/paper-styles/typography.html","1e421eceab74be3206d130933c0768fb"],["gwtPolymerDemo/bower_components/paper-tabs/paper-tab.html","4e21ba28911caddb9abd45686daef118"],["gwtPolymerDemo/bower_components/paper-tabs/paper-tabs-icons.html","0f4cfe2aab9adc37ad0deea2bbe09a04"],["gwtPolymerDemo/bower_components/paper-tabs/paper-tabs.html","1a5242f61bd1c23bef79cc68b4d8e246"],["gwtPolymerDemo/bower_components/paper-toast/paper-toast.html","940d5eb607d8b533b476bbe9994ffd69"],["gwtPolymerDemo/bower_components/paper-toggle-button/paper-toggle-button.html","0b2f1d3f7df0470d14dea8bee8f2cad3"],["gwtPolymerDemo/bower_components/paper-toolbar/paper-toolbar.html","a33da1ef1b440b2464f69f0c82c43853"],["gwtPolymerDemo/bower_components/paper-tooltip/paper-tooltip.html","d6e616c0b8edf6bbca67f5947892a4f7"],["gwtPolymerDemo/bower_components/polymer/polymer-micro.html","c0a6a1aea2d2b8c30431d6f8f02726e8"],["gwtPolymerDemo/bower_components/polymer/polymer-mini.html","b80b33997503559334cf2c5702f4e8b0"],["gwtPolymerDemo/bower_components/polymer/polymer.html","e64791b71ed76d6dd1977868460e86cc"],["gwtPolymerDemo/bower_components/promise-polyfill/Promise.js","6d72e76387d06f828797b0ce05a2feb7"],["gwtPolymerDemo/bower_components/promise-polyfill/promise-polyfill-lite.html","965c7e4a3b59ae6da112c36ef7fcaeb6"],["gwtPolymerDemo/bower_components/vaadin-combo-box/vaadin-combo-box-behavior.html","04ded7ad02ffdc393f7885e6707414be"],["gwtPolymerDemo/bower_components/vaadin-combo-box/vaadin-combo-box-icons.html","fc5ecd3ab59fc150a898662df17d180c"],["gwtPolymerDemo/bower_components/vaadin-combo-box/vaadin-combo-box-overlay.html","1695b1f0f175e55a2f91ca5987429baa"],["gwtPolymerDemo/bower_components/vaadin-combo-box/vaadin-combo-box-shared-styles.html","36298459f81d4822bf7fc511606a6126"],["gwtPolymerDemo/bower_components/vaadin-combo-box/vaadin-combo-box.html","278fe4db8dc7279e2c49576f1e84bb41"],["gwtPolymerDemo/bower_components/vaadin-combo-box/vaadin-dropdown-behavior.html","3aa16a336bb60f829a3e4bd1531dd8b1"],["gwtPolymerDemo/bower_components/vaadin-combo-box/vaadin-overlay-behavior.html","f8f1d906a491bb08c2a145dc0278eb73"],["gwtPolymerDemo/bower_components/vaadin-context-menu/vaadin-context-menu-overlay.html","1b29a2a01c3b94455db5789997190eb2"],["gwtPolymerDemo/bower_components/vaadin-context-menu/vaadin-context-menu.html","3d8bd17e87580b0794df2f146638038b"],["gwtPolymerDemo/bower_components/vaadin-context-menu/vaadin-device-detector.html","ad1ad582f624264007547d0604dc89c4"],["gwtPolymerDemo/bower_components/vaadin-context-menu/vaadin-long-touch.html","58ac3b8b5429d17a63f8b14ee415bda3"],["gwtPolymerDemo/bower_components/vaadin-date-picker/vaadin-date-picker-behavior.html","b878abd99414cba2f4386fc70a66c9c0"],["gwtPolymerDemo/bower_components/vaadin-date-picker/vaadin-date-picker-overlay.html","9dee1a4fb8602df0a839a7f3c5c6213d"],["gwtPolymerDemo/bower_components/vaadin-date-picker/vaadin-date-picker.html","4662ccedef5071b6b42709dcea2d236f"],["gwtPolymerDemo/bower_components/vaadin-date-picker/vaadin-infinite-scroller.html","f474ff509aeab8336f7754d207d88c64"],["gwtPolymerDemo/bower_components/vaadin-date-picker/vaadin-month-calendar.html","ca6c248da2ecd12ec061736d9ffff132"],["gwtPolymerDemo/bower_components/vaadin-grid/img/ic_view_column_black_24px.svg","d72e622178aa75584380f398970fe560"],["gwtPolymerDemo/bower_components/vaadin-grid/vaadin-grid.html","aeaa49c4bc40b0ffcb443655588a6c4b"],["gwtPolymerDemo/bower_components/vaadin-grid/vaadin-grid.min.js","8e7104f22617f2e61a46abc66cde7dab"],["gwtPolymerDemo/bower_components/vaadin-icons/vaadin-icons.html","0ecdb14636325061b3398ce5ed900653"],["gwtPolymerDemo/bower_components/vaadin-mock-xhr/vaadin-mock-xhr.html","d72c7c3c4b8f31fba9e05e12821033e4"],["gwtPolymerDemo/bower_components/vaadin-split-layout/vaadin-split-layout.html","0afea8d54ef25274c9a898c2515b1325"],["gwtPolymerDemo/bower_components/vaadin-upload/vaadin-upload-file.html","a44bccc99ff936fb45b06a71f85b9b4b"],["gwtPolymerDemo/bower_components/vaadin-upload/vaadin-upload-icons.html","e3fe1216752b154f0cf8416e2137ea21"],["gwtPolymerDemo/bower_components/vaadin-upload/vaadin-upload.html","96f3d4c70f4b4cbc1057ba031e5a86e1"],["gwtPolymerDemo/bower_components/web-animations-js/web-animations-next-lite.min.js","5ad79556ec7b425bc8c886d50fc79274"],["gwtPolymerDemo/bower_components/webcomponentsjs/webcomponents-lite.min.js","89313f9f2126ddea722150f8154aca03"],["gwtPolymerDemo/contacts.json","1a4c88220d4a53c7419887d961f73e87"],["gwtPolymerDemo/elements.json","96e091c50c945228e7e6fa03c51b8e53"],["gwtPolymerDemo/gwtPolymerDemo.nocache.js","fa7f0b21a19d9bcb7b767a2cc69bd9d2"],["gwtPolymerDemo/polymer.svg","e98c956da966b48986cfacb3520fede7"],["img/gwt.png","b3664538cae16caa735996998173f6bc"],["index.html","8a39f3ded87036ac382c7991d8030496"],["manifest.json","afa1da3f23fb740cc55b9e52d817f3f2"]];
var cacheName = 'sw-precache-v2-sw-precache-' + (self.registration ? self.registration.scope : '');


var ignoreUrlParametersMatching = [/^utm_/];



var addDirectoryIndex = function (originalUrl, index) {
    var url = new URL(originalUrl);
    if (url.pathname.slice(-1) === '/') {
      url.pathname += index;
    }
    return url.toString();
  };

var createCacheKey = function (originalUrl, paramName, paramValue,
                           dontCacheBustUrlsMatching) {
    // Create a new URL object to avoid modifying originalUrl.
    var url = new URL(originalUrl);

    // If dontCacheBustUrlsMatching is not set, or if we don't have a match,
    // then add in the extra cache-busting URL parameter.
    if (!dontCacheBustUrlsMatching ||
        !(url.toString().match(dontCacheBustUrlsMatching))) {
      url.search += (url.search ? '&' : '') +
        encodeURIComponent(paramName) + '=' + encodeURIComponent(paramValue);
    }

    return url.toString();
  };

var isPathWhitelisted = function (whitelist, absoluteUrlString) {
    // If the whitelist is empty, then consider all URLs to be whitelisted.
    if (whitelist.length === 0) {
      return true;
    }

    // Otherwise compare each path regex to the path of the URL passed in.
    var path = (new URL(absoluteUrlString)).pathname;
    return whitelist.some(function(whitelistedPathRegex) {
      return path.match(whitelistedPathRegex);
    });
  };

var stripIgnoredUrlParameters = function (originalUrl,
    ignoreUrlParametersMatching) {
    var url = new URL(originalUrl);

    url.search = url.search.slice(1) // Exclude initial '?'
      .split('&') // Split into an array of 'key=value' strings
      .map(function(kv) {
        return kv.split('='); // Split each 'key=value' string into a [key, value] array
      })
      .filter(function(kv) {
        return ignoreUrlParametersMatching.every(function(ignoredRegex) {
          return !ignoredRegex.test(kv[0]); // Return true iff the key doesn't match any of the regexes.
        });
      })
      .map(function(kv) {
        return kv.join('='); // Join each [key, value] array into a 'key=value' string
      })
      .join('&'); // Join the array of 'key=value' strings into a string with '&' in between each

    return url.toString();
  };


var hashParamName = '_sw-precache';
var urlsToCacheKeys = new Map(
  precacheConfig.map(function(item) {
    var relativeUrl = item[0];
    var hash = item[1];
    var absoluteUrl = new URL(relativeUrl, self.location);
    var cacheKey = createCacheKey(absoluteUrl, hashParamName, hash, false);
    return [absoluteUrl.toString(), cacheKey];
  })
);

function setOfCachedUrls(cache) {
  return cache.keys().then(function(requests) {
    return requests.map(function(request) {
      return request.url;
    });
  }).then(function(urls) {
    return new Set(urls);
  });
}

self.addEventListener('install', function(event) {
  event.waitUntil(
    caches.open(cacheName).then(function(cache) {
      return setOfCachedUrls(cache).then(function(cachedUrls) {
        return Promise.all(
          Array.from(urlsToCacheKeys.values()).map(function(cacheKey) {
            // If we don't have a key matching url in the cache already, add it.
            if (!cachedUrls.has(cacheKey)) {
              return cache.add(new Request(cacheKey, {credentials: 'same-origin'}));
            }
          })
        );
      });
    }).then(function() {
      
      // Force the SW to transition from installing -> active state
      return self.skipWaiting();
      
    })
  );
});

self.addEventListener('activate', function(event) {
  var setOfExpectedUrls = new Set(urlsToCacheKeys.values());

  event.waitUntil(
    caches.open(cacheName).then(function(cache) {
      return cache.keys().then(function(existingRequests) {
        return Promise.all(
          existingRequests.map(function(existingRequest) {
            if (!setOfExpectedUrls.has(existingRequest.url)) {
              return cache.delete(existingRequest);
            }
          })
        );
      });
    }).then(function() {
      
      return self.clients.claim();
      
    })
  );
});


self.addEventListener('fetch', function(event) {
  if (event.request.method === 'GET') {
    // Should we call event.respondWith() inside this fetch event handler?
    // This needs to be determined synchronously, which will give other fetch
    // handlers a chance to handle the request if need be.
    var shouldRespond;

    // First, remove all the ignored parameter and see if we have that URL
    // in our cache. If so, great! shouldRespond will be true.
    var url = stripIgnoredUrlParameters(event.request.url, ignoreUrlParametersMatching);
    shouldRespond = urlsToCacheKeys.has(url);

    // If shouldRespond is false, check again, this time with 'index.html'
    // (or whatever the directoryIndex option is set to) at the end.
    var directoryIndex = 'index.html';
    if (!shouldRespond && directoryIndex) {
      url = addDirectoryIndex(url, directoryIndex);
      shouldRespond = urlsToCacheKeys.has(url);
    }

    // If shouldRespond is still false, check to see if this is a navigation
    // request, and if so, whether the URL matches navigateFallbackWhitelist.
    var navigateFallback = 'index.html';
    if (!shouldRespond &&
        navigateFallback &&
        (event.request.mode === 'navigate') &&
        isPathWhitelisted([], event.request.url)) {
      url = new URL(navigateFallback, self.location).toString();
      shouldRespond = urlsToCacheKeys.has(url);
    }

    // If shouldRespond was set to true at any point, then call
    // event.respondWith(), using the appropriate cache key.
    if (shouldRespond) {
      event.respondWith(
        caches.open(cacheName).then(function(cache) {
          return cache.match(urlsToCacheKeys.get(url)).then(function(response) {
            if (response) {
              return response;
            }
            throw Error('The cached response that was expected is missing.');
          });
        }).catch(function(e) {
          // Fall back to just fetch()ing the request if some unexpected error
          // prevented the cached response from being valid.
          console.warn('Couldn\'t serve response for "%s" from cache: %O', event.request.url, e);
          return fetch(event.request);
        })
      );
    }
  }
});


// *** Start of auto-included sw-toolbox code. ***
/* 
 Copyright 2016 Google Inc. All Rights Reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
*/!function(e){if("object"==typeof exports&&"undefined"!=typeof module)module.exports=e();else if("function"==typeof define&&define.amd)define([],e);else{var t;t="undefined"!=typeof window?window:"undefined"!=typeof global?global:"undefined"!=typeof self?self:this,t.toolbox=e()}}(function(){return function e(t,n,r){function o(c,s){if(!n[c]){if(!t[c]){var a="function"==typeof require&&require;if(!s&&a)return a(c,!0);if(i)return i(c,!0);var u=new Error("Cannot find module '"+c+"'");throw u.code="MODULE_NOT_FOUND",u}var f=n[c]={exports:{}};t[c][0].call(f.exports,function(e){var n=t[c][1][e];return o(n?n:e)},f,f.exports,e,t,n,r)}return n[c].exports}for(var i="function"==typeof require&&require,c=0;c<r.length;c++)o(r[c]);return o}({1:[function(e,t,n){"use strict";function r(e,t){t=t||{};var n=t.debug||d.debug;n&&console.log("[sw-toolbox] "+e)}function o(e){var t;return e&&e.cache&&(t=e.cache.name),t=t||d.cache.name,caches.open(t)}function i(e,t){t=t||{};var n=t.successResponses||d.successResponses;return fetch(e.clone()).then(function(r){return"GET"===e.method&&n.test(r.status)&&o(t).then(function(n){n.put(e,r).then(function(){var r=t.cache||d.cache;(r.maxEntries||r.maxAgeSeconds)&&r.name&&c(e,n,r)})}),r.clone()})}function c(e,t,n){var r=s.bind(null,e,t,n);l=l?l.then(r):r()}function s(e,t,n){var o=e.url,i=n.maxAgeSeconds,c=n.maxEntries,s=n.name,a=Date.now();return r("Updating LRU order for "+o+". Max entries is "+c+", max age is "+i),g.getDb(s).then(function(e){return g.setTimestampForUrl(e,o,a)}).then(function(e){return g.expireEntries(e,c,i,a)}).then(function(e){r("Successfully updated IDB.");var n=e.map(function(e){return t.delete(e)});return Promise.all(n).then(function(){r("Done with cache cleanup.")})}).catch(function(e){r(e)})}function a(e,t,n){return r("Renaming cache: ["+e+"] to ["+t+"]",n),caches.delete(t).then(function(){return Promise.all([caches.open(e),caches.open(t)]).then(function(t){var n=t[0],r=t[1];return n.keys().then(function(e){return Promise.all(e.map(function(e){return n.match(e).then(function(t){return r.put(e,t)})}))}).then(function(){return caches.delete(e)})})})}function u(e,t){return o(t).then(function(t){return t.add(e)})}function f(e,t){return o(t).then(function(t){return t.delete(e)})}function h(e){e instanceof Promise||p(e),d.preCacheItems=d.preCacheItems.concat(e)}function p(e){var t=Array.isArray(e);if(t&&e.forEach(function(e){"string"==typeof e||e instanceof Request||(t=!1)}),!t)throw new TypeError("The precache method expects either an array of strings and/or Requests or a Promise that resolves to an array of strings and/or Requests.");return e}var l,d=e("./options"),g=e("./idb-cache-expiration");t.exports={debug:r,fetchAndCache:i,openCache:o,renameCache:a,cache:u,uncache:f,precache:h,validatePrecacheInput:p}},{"./idb-cache-expiration":2,"./options":4}],2:[function(e,t,n){"use strict";function r(e){return new Promise(function(t,n){var r=indexedDB.open(u+e,f);r.onupgradeneeded=function(){var e=r.result.createObjectStore(h,{keyPath:p});e.createIndex(l,l,{unique:!1})},r.onsuccess=function(){t(r.result)},r.onerror=function(){n(r.error)}})}function o(e){return e in d||(d[e]=r(e)),d[e]}function i(e,t,n){return new Promise(function(r,o){var i=e.transaction(h,"readwrite"),c=i.objectStore(h);c.put({url:t,timestamp:n}),i.oncomplete=function(){r(e)},i.onabort=function(){o(i.error)}})}function c(e,t,n){return t?new Promise(function(r,o){var i=1e3*t,c=[],s=e.transaction(h,"readwrite"),a=s.objectStore(h),u=a.index(l);u.openCursor().onsuccess=function(e){var t=e.target.result;if(t&&n-i>t.value[l]){var r=t.value[p];c.push(r),a.delete(r),t.continue()}},s.oncomplete=function(){r(c)},s.onabort=o}):Promise.resolve([])}function s(e,t){return t?new Promise(function(n,r){var o=[],i=e.transaction(h,"readwrite"),c=i.objectStore(h),s=c.index(l),a=s.count();s.count().onsuccess=function(){var e=a.result;e>t&&(s.openCursor().onsuccess=function(n){var r=n.target.result;if(r){var i=r.value[p];o.push(i),c.delete(i),e-o.length>t&&r.continue()}})},i.oncomplete=function(){n(o)},i.onabort=r}):Promise.resolve([])}function a(e,t,n,r){return c(e,n,r).then(function(n){return s(e,t).then(function(e){return n.concat(e)})})}var u="sw-toolbox-",f=1,h="store",p="url",l="timestamp",d={};t.exports={getDb:o,setTimestampForUrl:i,expireEntries:a}},{}],3:[function(e,t,n){"use strict";function r(e){var t=a.match(e.request);t?e.respondWith(t(e.request)):a.default&&"GET"===e.request.method&&0===e.request.url.indexOf("http")&&e.respondWith(a.default(e.request))}function o(e){s.debug("activate event fired");var t=u.cache.name+"$$$inactive$$$";e.waitUntil(s.renameCache(t,u.cache.name))}function i(e){return e.reduce(function(e,t){return e.concat(t)},[])}function c(e){var t=u.cache.name+"$$$inactive$$$";s.debug("install event fired"),s.debug("creating cache ["+t+"]"),e.waitUntil(s.openCache({cache:{name:t}}).then(function(e){return Promise.all(u.preCacheItems).then(i).then(s.validatePrecacheInput).then(function(t){return s.debug("preCache list: "+(t.join(", ")||"(none)")),e.addAll(t)})}))}e("serviceworker-cache-polyfill");var s=e("./helpers"),a=e("./router"),u=e("./options");t.exports={fetchListener:r,activateListener:o,installListener:c}},{"./helpers":1,"./options":4,"./router":6,"serviceworker-cache-polyfill":16}],4:[function(e,t,n){"use strict";var r;r=self.registration?self.registration.scope:self.scope||new URL("./",self.location).href,t.exports={cache:{name:"$$$toolbox-cache$$$"+r+"$$$",maxAgeSeconds:null,maxEntries:null},debug:!1,networkTimeoutSeconds:null,preCacheItems:[],successResponses:/^0|([123]\d\d)|(40[14567])|410$/}},{}],5:[function(e,t,n){"use strict";var r=new URL("./",self.location),o=r.pathname,i=e("path-to-regexp"),c=function(e,t,n,r){t instanceof RegExp?this.fullUrlRegExp=t:(0!==t.indexOf("/")&&(t=o+t),this.keys=[],this.regexp=i(t,this.keys)),this.method=e,this.options=r,this.handler=n};c.prototype.makeHandler=function(e){var t;if(this.regexp){var n=this.regexp.exec(e);t={},this.keys.forEach(function(e,r){t[e.name]=n[r+1]})}return function(e){return this.handler(e,t,this.options)}.bind(this)},t.exports=c},{"path-to-regexp":15}],6:[function(e,t,n){"use strict";function r(e){return e.replace(/[-\/\\^$*+?.()|[\]{}]/g,"\\$&")}var o=e("./route"),i=e("./helpers"),c=function(e,t){for(var n=e.entries(),r=n.next(),o=[];!r.done;){var i=new RegExp(r.value[0]);i.test(t)&&o.push(r.value[1]),r=n.next()}return o},s=function(){this.routes=new Map,this.routes.set(RegExp,new Map),this.default=null};["get","post","put","delete","head","any"].forEach(function(e){s.prototype[e]=function(t,n,r){return this.add(e,t,n,r)}}),s.prototype.add=function(e,t,n,c){c=c||{};var s;t instanceof RegExp?s=RegExp:(s=c.origin||self.location.origin,s=s instanceof RegExp?s.source:r(s)),e=e.toLowerCase();var a=new o(e,t,n,c);this.routes.has(s)||this.routes.set(s,new Map);var u=this.routes.get(s);u.has(e)||u.set(e,new Map);var f=u.get(e),h=a.regexp||a.fullUrlRegExp;f.has(h.source)&&i.debug('"'+t+'" resolves to same regex as existing route.'),f.set(h.source,a)},s.prototype.matchMethod=function(e,t){var n=new URL(t),r=n.origin,o=n.pathname;return this._match(e,c(this.routes,r),o)||this._match(e,[this.routes.get(RegExp)],t)},s.prototype._match=function(e,t,n){if(0===t.length)return null;for(var r=0;r<t.length;r++){var o=t[r],i=o&&o.get(e.toLowerCase());if(i){var s=c(i,n);if(s.length>0)return s[0].makeHandler(n)}}return null},s.prototype.match=function(e){return this.matchMethod(e.method,e.url)||this.matchMethod("any",e.url)},t.exports=new s},{"./helpers":1,"./route":5}],7:[function(e,t,n){"use strict";function r(e,t,n){return o.debug("Strategy: cache first ["+e.url+"]",n),o.openCache(n).then(function(t){return t.match(e).then(function(t){return t?t:o.fetchAndCache(e,n)})})}var o=e("../helpers");t.exports=r},{"../helpers":1}],8:[function(e,t,n){"use strict";function r(e,t,n){return o.debug("Strategy: cache only ["+e.url+"]",n),o.openCache(n).then(function(t){return t.match(e)})}var o=e("../helpers");t.exports=r},{"../helpers":1}],9:[function(e,t,n){"use strict";function r(e,t,n){return o.debug("Strategy: fastest ["+e.url+"]",n),new Promise(function(r,c){var s=!1,a=[],u=function(e){a.push(e.toString()),s?c(new Error('Both cache and network failed: "'+a.join('", "')+'"')):s=!0},f=function(e){e instanceof Response?r(e):u("No result returned")};o.fetchAndCache(e.clone(),n).then(f,u),i(e,t,n).then(f,u)})}var o=e("../helpers"),i=e("./cacheOnly");t.exports=r},{"../helpers":1,"./cacheOnly":8}],10:[function(e,t,n){t.exports={networkOnly:e("./networkOnly"),networkFirst:e("./networkFirst"),cacheOnly:e("./cacheOnly"),cacheFirst:e("./cacheFirst"),fastest:e("./fastest")}},{"./cacheFirst":7,"./cacheOnly":8,"./fastest":9,"./networkFirst":11,"./networkOnly":12}],11:[function(e,t,n){"use strict";function r(e,t,n){n=n||{};var r=n.successResponses||o.successResponses,c=n.networkTimeoutSeconds||o.networkTimeoutSeconds;return i.debug("Strategy: network first ["+e.url+"]",n),i.openCache(n).then(function(t){var o,s,a=[];if(c){var u=new Promise(function(n){o=setTimeout(function(){t.match(e).then(function(e){e&&n(e)})},1e3*c)});a.push(u)}var f=i.fetchAndCache(e,n).then(function(e){if(o&&clearTimeout(o),r.test(e.status))return e;throw i.debug("Response was an HTTP error: "+e.statusText,n),s=e,new Error("Bad response")}).catch(function(r){return i.debug("Network or response error, fallback to cache ["+e.url+"]",n),t.match(e).then(function(e){if(e)return e;if(s)return s;throw r})});return a.push(f),Promise.race(a)})}var o=e("../options"),i=e("../helpers");t.exports=r},{"../helpers":1,"../options":4}],12:[function(e,t,n){"use strict";function r(e,t,n){return o.debug("Strategy: network only ["+e.url+"]",n),fetch(e)}var o=e("../helpers");t.exports=r},{"../helpers":1}],13:[function(e,t,n){"use strict";var r=e("./options"),o=e("./router"),i=e("./helpers"),c=e("./strategies"),s=e("./listeners");i.debug("Service Worker Toolbox is loading"),self.addEventListener("install",s.installListener),self.addEventListener("activate",s.activateListener),self.addEventListener("fetch",s.fetchListener),t.exports={networkOnly:c.networkOnly,networkFirst:c.networkFirst,cacheOnly:c.cacheOnly,cacheFirst:c.cacheFirst,fastest:c.fastest,router:o,options:r,cache:i.cache,uncache:i.uncache,precache:i.precache}},{"./helpers":1,"./listeners":3,"./options":4,"./router":6,"./strategies":10}],14:[function(e,t,n){t.exports=Array.isArray||function(e){return"[object Array]"==Object.prototype.toString.call(e)}},{}],15:[function(e,t,n){function r(e){for(var t,n=[],r=0,o=0,i="";null!=(t=x.exec(e));){var c=t[0],s=t[1],a=t.index;if(i+=e.slice(o,a),o=a+c.length,s)i+=s[1];else{var f=e[o],h=t[2],p=t[3],l=t[4],d=t[5],g=t[6],m=t[7];i&&(n.push(i),i="");var v=null!=h&&null!=f&&f!==h,w="+"===g||"*"===g,y="?"===g||"*"===g,b=t[2]||"/",E=l||d||(m?".*":"[^"+b+"]+?");n.push({name:p||r++,prefix:h||"",delimiter:b,optional:y,repeat:w,partial:v,asterisk:!!m,pattern:u(E)})}}return o<e.length&&(i+=e.substr(o)),i&&n.push(i),n}function o(e){return s(r(e))}function i(e){return encodeURI(e).replace(/[\/?#]/g,function(e){return"%"+e.charCodeAt(0).toString(16).toUpperCase()})}function c(e){return encodeURI(e).replace(/[?#]/g,function(e){return"%"+e.charCodeAt(0).toString(16).toUpperCase()})}function s(e){for(var t=new Array(e.length),n=0;n<e.length;n++)"object"==typeof e[n]&&(t[n]=new RegExp("^(?:"+e[n].pattern+")$"));return function(n,r){for(var o="",s=n||{},a=r||{},u=a.pretty?i:encodeURIComponent,f=0;f<e.length;f++){var h=e[f];if("string"!=typeof h){var p,l=s[h.name];if(null==l){if(h.optional){h.partial&&(o+=h.prefix);continue}throw new TypeError('Expected "'+h.name+'" to be defined')}if(v(l)){if(!h.repeat)throw new TypeError('Expected "'+h.name+'" to not repeat, but received `'+JSON.stringify(l)+"`");if(0===l.length){if(h.optional)continue;throw new TypeError('Expected "'+h.name+'" to not be empty')}for(var d=0;d<l.length;d++){if(p=u(l[d]),!t[f].test(p))throw new TypeError('Expected all "'+h.name+'" to match "'+h.pattern+'", but received `'+JSON.stringify(p)+"`");o+=(0===d?h.prefix:h.delimiter)+p}}else{if(p=h.asterisk?c(l):u(l),!t[f].test(p))throw new TypeError('Expected "'+h.name+'" to match "'+h.pattern+'", but received "'+p+'"');o+=h.prefix+p}}else o+=h}return o}}function a(e){return e.replace(/([.+*?=^!:${}()[\]|\/\\])/g,"\\$1")}function u(e){return e.replace(/([=!:$\/()])/g,"\\$1")}function f(e,t){return e.keys=t,e}function h(e){return e.sensitive?"":"i"}function p(e,t){var n=e.source.match(/\((?!\?)/g);if(n)for(var r=0;r<n.length;r++)t.push({name:r,prefix:null,delimiter:null,optional:!1,repeat:!1,partial:!1,asterisk:!1,pattern:null});return f(e,t)}function l(e,t,n){for(var r=[],o=0;o<e.length;o++)r.push(m(e[o],t,n).source);var i=new RegExp("(?:"+r.join("|")+")",h(n));return f(i,t)}function d(e,t,n){for(var o=r(e),i=g(o,n),c=0;c<o.length;c++)"string"!=typeof o[c]&&t.push(o[c]);return f(i,t)}function g(e,t){t=t||{};for(var n=t.strict,r=t.end!==!1,o="",i=e[e.length-1],c="string"==typeof i&&/\/$/.test(i),s=0;s<e.length;s++){var u=e[s];if("string"==typeof u)o+=a(u);else{var f=a(u.prefix),p="(?:"+u.pattern+")";u.repeat&&(p+="(?:"+f+p+")*"),p=u.optional?u.partial?f+"("+p+")?":"(?:"+f+"("+p+"))?":f+"("+p+")",o+=p}}return n||(o=(c?o.slice(0,-2):o)+"(?:\\/(?=$))?"),o+=r?"$":n&&c?"":"(?=\\/|$)",new RegExp("^"+o,h(t))}function m(e,t,n){return t=t||[],v(t)?n||(n={}):(n=t,t=[]),e instanceof RegExp?p(e,t):v(e)?l(e,t,n):d(e,t,n)}var v=e("isarray");t.exports=m,t.exports.parse=r,t.exports.compile=o,t.exports.tokensToFunction=s,t.exports.tokensToRegExp=g;var x=new RegExp(["(\\\\.)","([\\/.])?(?:(?:\\:(\\w+)(?:\\(((?:\\\\.|[^\\\\()])+)\\))?|\\(((?:\\\\.|[^\\\\()])+)\\))([+*?])?|(\\*))"].join("|"),"g")},{isarray:14}],16:[function(e,t,n){!function(){var e=Cache.prototype.addAll,t=navigator.userAgent.match(/(Firefox|Chrome)\/(\d+\.)/);if(t)var n=t[1],r=parseInt(t[2]);e&&(!t||"Firefox"===n&&r>=46||"Chrome"===n&&r>=50)||(Cache.prototype.addAll=function(e){function t(e){this.name="NetworkError",this.code=19,this.message=e}var n=this;return t.prototype=Object.create(Error.prototype),Promise.resolve().then(function(){if(arguments.length<1)throw new TypeError;return e=e.map(function(e){return e instanceof Request?e:String(e)}),Promise.all(e.map(function(e){"string"==typeof e&&(e=new Request(e));var n=new URL(e.url).protocol;if("http:"!==n&&"https:"!==n)throw new t("Invalid scheme");return fetch(e.clone())}))}).then(function(r){if(r.some(function(e){return!e.ok}))throw new t("Incorrect response status");return Promise.all(r.map(function(t,r){return n.put(e[r],t)}))}).then(function(){})},Cache.prototype.add=function(e){return this.addAll([e])})}()},{}]},{},[13])(13)});


// *** End of auto-included sw-toolbox code. ***



// Runtime cache configuration, using the sw-toolbox library.

toolbox.router.get(/^https:\/\/(robohash\.org|fonts\.googleapis\.com)\//, toolbox.fastest, {"cache":{"maxEntries":50,"name":"robots-images"}});




