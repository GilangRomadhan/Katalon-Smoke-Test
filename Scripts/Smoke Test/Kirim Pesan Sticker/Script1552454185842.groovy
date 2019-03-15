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

Mobile.tap(findTestObject('General/general.btn - 08995097611'), 1)

Mobile.tap(findTestObject('Chat/chat.btn-Sticker'), 1)

Mobile.tap(findTestObject('Chat/chat.btn- Download Sticker'), 1)

Mobile.delay(20)

Mobile.verifyElementVisible(findTestObject('Chat/chat.btn- First Sticker'), 10)

Mobile.tap(findTestObject('Chat/chat.btn- First Sticker'), 60)

Mobile.tap(findTestObject('Chat/chat.btn- Send Sticker'), 1)

Mobile.verifyElementVisible(findTestObject('Chat/chat.symbol-Terkirim'), 30)

Mobile.tap(findTestObject('Chat/chat.btn - Back'), 1)

