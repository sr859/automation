$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Test.feature");
formatter.feature({
  "name": "Validation of Birdeye Homepage website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verifying the birdeye footer part learn more links",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BirdEyeLinks"
    }
  ]
});
formatter.step({
  "name": "user is on the birdeye home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.user_is_on_the_birdeye_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify All Headers Navigations are working fine",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.verifyAllHeaderNavigationisWorkingFine()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d107.0.5304.121)\nBuild info: version: \u00274.0.0\u0027, revision: \u00273a21814679\u0027\nSystem info: host: \u0027LATITUDE3420-SA\u0027, ip: \u0027192.168.1.7\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [3ddb20c85267cc664e2c2a83e29b029c, findElement {using\u003dxpath, value\u003d//ul[@class\u003d\u0027css-cgayqz\u0027]/li[1]//a}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 107.0.5304.121, chrome: {chromedriverVersion: 107.0.5304.62 (1eec40d3a576..., userDataDir: C:\\Users\\Santosh\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:55295}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:55295/devtoo..., se:cdpVersion: 107.0.5304.121, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 3ddb20c85267cc664e2c2a83e29b029c\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:139)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:559)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:383)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:375)\r\n\tat com.stepdefination.StepDefination.verifyAllHeaderNavigationisWorkingFine(StepDefination.java:759)\r\n\tat ✽.Verify All Headers Navigations are working fine(file:src/test/resources/Features/Test.feature:6)\r\n",
  "status": "failed"
});
});