import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/pczone/loginPCzone.php')

WebUI.setText(findTestObject('Object Repository/Page_Login  Registration/input__UserName'), 'kanokphon')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Registration/input__Passwords'), 'aeHFOx8jV/A=')

WebUI.sendKeys(findTestObject('Object Repository/Page_Login  Registration/input__Passwords'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Pc Zone/a_Buy Now2'))

WebUI.click(findTestObject('Object Repository/Page_Pc Zone/button_'))

WebUI.verifyTextPresent('GIGABYTE GEFORCE GTX 1650', false)

