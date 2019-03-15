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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

'Start Netzme'
Mobile.startApplication('C:\\Git\\Katalon-master\\Data Files\\APK\\Netzme.apk', false)

'Tap tombol NEXT'
Mobile.tap(findTestObject('Registrasi/reg.btn-Next'), 10)

Mobile.tap(findTestObject('Registrasi/reg.btn-Next'), 2)

Mobile.tap(findTestObject('Registrasi/reg.btn-Next'), 2)

Mobile.tap(findTestObject('Registrasi/reg.btn-Next'), 2)

Mobile.tap(findTestObject('Registrasi/reg.btn-Next'), 2)

Mobile.tap(findTestObject('Registrasi/reg.btn-JOIN NOW'), 2)

Mobile.setText(findTestObject('Registrasi/reg.button-Phone number'), '08995097655', 2)

Mobile.tap(findTestObject('Registrasi/reg.checkbock-Term condition'), 2)

Mobile.tap(findTestObject('Registrasi/reg.button-REGISTER'), 2)

Mobile.setText(findTestObject('Registrasi/reg.editText-Verification Number'), '0000', 2)

Mobile.tap(findTestObject('Registrasi/reg.btn-VERIFY'), 2)

Mobile.tap(findTestObject('General/general.btn - Allow'), 10)

Mobile.clearText(findTestObject('Registrasi/reg.editText-Ganti Nick Name'), 2)

Mobile.setText(findTestObject('Registrasi/reg.editText-Enter your name here'), 'QA Netzme', 2)

Mobile.tap(findTestObject('Registrasi/reg.button-SAVE'), 5)

Mobile.tap(findTestObject('Registrasi/reg.checkbox-Dont show me again'), 60)

Mobile.tap(findTestObject('Registrasi/reg.button-CLOSE'), 2)

