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

Mobile.setText(findTestObject('General/general.textField - Search contact  group'), 'Create Group by GR', 1)

'Plih Leave group\r\n\r\n\r\n'
Mobile.tap(findTestObject('Front View/frontView.text - Create Group by GR'), 1)

Mobile.tap(findTestObject('Front View/frontView.text - Create Group by GR'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHold(findTestObject('General/general.text - 08995097611'), 0, 5)

Mobile.tap(findTestObject('Group/Group.btn - Remove from group'), 1)

Mobile.tap(findTestObject('Group/Group.btn - REMOVE'), 1)

Mobile.tap(findTestObject('General/general.btn-Back'), 1)

Mobile.verifyElementVisible(findTestObject('Group/Group.text - You removed 08995097611'), 30)

