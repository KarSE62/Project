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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/pczone/Register.php')

WebUI.setText(findTestObject('Object Repository/Page_/input__Fname'), 'ณัฐพล')

WebUI.setText(findTestObject('Object Repository/Page_/input__Lname'), 'แซ่โฟ้ง')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_...               1                2_d292cf'), 
    '20', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_...                                 _e822cf'), 
    'กุมภาพันธ์', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_...               2020              _9c179b'), 
    '2001', true)

WebUI.setText(findTestObject('Object Repository/Page_/input_UserName_UserName'), 'nutty')

WebUI.setText(findTestObject('Object Repository/Page_/input_Email_Email'), 'nutty@hotmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Password_Password'), 'aeHFOx8jV/A=')

WebUI.setText(findTestObject('Object Repository/Page_/input__PhoneNum'), '0800427398')

WebUI.setText(findTestObject('Object Repository/Page_/textarea_Address ()_Address'), 'หอหลังมหาวิทยาลัยราชภัฏนครปฐม')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_...                                 _38e30b'), 
    'นครปฐม', true)

WebUI.setText(findTestObject('Object Repository/Page_/input__District'), 'เมือง')

WebUI.setText(findTestObject('Object Repository/Page_/input__Pcode'), '73000')

WebUI.click(findTestObject('Register/button_Regis'))

WebUI.verifyTextPresent('ณัฐพล', false)

