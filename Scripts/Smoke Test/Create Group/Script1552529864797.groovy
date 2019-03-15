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

Mobile.tap(findTestObject('Front View/frontView-New Group'), 1)

Mobile.tap(findTestObject('Registrasi/reg.checkbox-Dont show me again'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('General/general.btn-GOT IT'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Front View/frontView.TextField-Group name'), 'Create Group by GR', 1)

Mobile.tap(findTestObject('Front View/frontView.btn - ADD MEMBER'), 1)

Mobile.setText(findTestObject('Front View/frontView - Search contact'), '08995097611', 1)

Mobile.tap(findTestObject('General/general.text - 08995097611'), 1)

Mobile.tap(findTestObject('Front View/frontView.btn - ADD'), 1)

Mobile.tap(findTestObject('Front View/frontView.btn - CREATE'), 1)

Mobile.verifyElementVisible(findTestObject('Front View/frontView.text - Create Group by GR'), 30)

