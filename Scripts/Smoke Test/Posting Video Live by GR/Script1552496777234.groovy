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

Mobile.tap(findTestObject('General/general.btn- Open Camera'), 1)

Mobile.tap(findTestObject('Chat/chat.btn - VIDEO'), 1)

Mobile.tap(findTestObject('Chat/chat.btn - Record Video'), 1)

Mobile.delay(11, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Front View/frontView.btn - Post to Stories'), 0)

Mobile.setText(findTestObject('General/general.btn - Describe your video'), 'Post Stories Live Photo by GR', 5)

Mobile.tap(findTestObject('Front View/frontview.btn - POST'), 0)

