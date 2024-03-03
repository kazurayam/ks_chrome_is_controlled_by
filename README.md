# "Chrome is being controlled by automated test software" --- how to stop it

I used:

- Katalon Studio v9.0.0
- Chrome v122

## Problem to solve

When I ran a Test Case to open a URL in Chrome browser, a text "Chrome is being controlled by automated test software" comes up.

![with](https://kazurayam.github.io/ks_chrome_is_controlled_by/images/With_the_message.png)

I want to get rid of this message.

## Solution

See https://help.applitools.com/hc/en-us/articles/360007189411--Chrome-is-being-controlled-by-automated-test-software-notification

In short, we can specify an option to ChromeDriver programatically;

```
ChromeOptions options = new ChromeOptions();
options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
WebDriver driver = new ChromeDriver(options);
```

But how to do the same for chrome opened by `WebUI.openBrower()` keyword in Katalon Studio?

## Solution description

In the `Project Settings > Desired Capabilities > Web UI > Chrome`, add a line:

![setting](https://kazurayam.github.io/ks_chrome_is_controlled_by/images/ProjectSettings_DesiredCapabilities_WebUI_Chrome.png)

then the message has disappered:

![without](https://kazurayam.github.io/ks_chrome_is_controlled_by/images/Without_the_message.png)

I am happy now.
