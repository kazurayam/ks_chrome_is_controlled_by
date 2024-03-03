import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.setViewPortSize(800, 375)
WebUI.navigateToUrl("http://demoaut.katalon.com/")
WebUI.delay(30)
WebUI.closeBrowser()