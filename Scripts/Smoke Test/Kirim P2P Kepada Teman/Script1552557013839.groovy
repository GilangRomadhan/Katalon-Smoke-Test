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

Mobile.tap(findTestObject('General/general.text - 08995097611'), 1)

Mobile.tap(findTestObject('Chat/chat.btn - p2p'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Chat/chat.text - 1'), 1)

Mobile.tap(findTestObject('Chat/chat.text - 00'), 5, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Chat/chat.text - 0'), 1)

Mobile.tap(findTestObject('Registrasi/reg.btn-Next'), 1)

Mobile.setText(findTestObject('Chat/chat.text - pin'), '123456', 2)

Mobile.setText(findTestObject('Chat/chat.textField - Write message'), 'Test Kirim P2P by GR ', 2)

Mobile.tap(findTestObject('Chat/chat.btn - SEND MONEY'), 2)

Mobile.verifyElementVisible(findTestObject('Chat/chat.btn - Rp 1.000'), 30)

Mobile.tap(findTestObject('General/general.btn-Back'), 2)

