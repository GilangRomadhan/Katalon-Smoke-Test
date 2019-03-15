import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.tap(findTestObject('Front View/frontView-Contact'), 1)

Mobile.tap(findTestObject('Front View/frontView-Smart Button'), 1)

Mobile.tap(findTestObject('Front View/frontView - Search'), 1)

Mobile.setText(findTestObject('General/general.textField - Search contact  group'), '08995097611', 30)

Mobile.tap(findTestObject('General/general.btn - 08995097611'), 1)

Mobile.setText(findTestObject('Chat/chat.btn - Type message here'), 'Test Send Text Message by GR', 1)

Mobile.tap(findTestObject('Chat/chat.btn - send'), 1)

Mobile.verifyElementVisible(findTestObject('Chat/chat.symbol-Terkirim'), 5, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Chat/chat.btn - Back'), 1)

Mobile.tap(findTestObject('General/general.btn-Back'), 1)

