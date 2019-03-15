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

'Header contact\r\n'
Mobile.tap(findTestObject('Front View/frontView-Contact'), 1)

Mobile.tap(findTestObject('Front View/frontView-User Profile'), 1)

Mobile.tap(findTestObject('General/general.btn-GOT IT'), 1)

Mobile.tap(findTestObject('Edit Profile/profile.btn-Edit Profile'), 1)

Mobile.tap(findTestObject('Edit Profile/profile.btn-Edit Photo Profile'), 1)

not_run: Mobile.tap(findTestObject('General/general.btn - Allow'), 1)

Mobile.tap(findTestObject('General/general.btn- Capture Image'), 1)

Mobile.tap(findTestObject('Edit Profile/profile.btn - CROP'), 1)

Mobile.setText(findTestObject('General/general.btn - Describe your photo'), 'Ganti Photo Profile', 1)

Mobile.tap(findTestObject('Edit Profile/profile.btn.after.describe.photo - SAVE'), 1)

Mobile.tap(findTestObject('Edit Profile/profile.btn- Save after edit PP'), 1)

Mobile.tap(findTestObject('Chat/chat.btn - Back'), 1)

