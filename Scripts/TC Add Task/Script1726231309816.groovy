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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\hastri.danahiswara\\Downloads\\Todo_2.0_APKPure.apk', true)

Mobile.tap(findTestObject('Object Repository/Make To Do/btn_ok informasi'), 0)

Mobile.tap(findTestObject('Object Repository/Make To Do/btn_skip'), 0)

Mobile.tap(findTestObject('Object Repository/Make To Do/btn_img add plus'), 0)

Mobile.setText(findTestObject('Object Repository/Make To Do/text_task title'), title, 10)

Mobile.setText(findTestObject('Object Repository/Make To Do/text_task'), task, 10)

Mobile.tap(findTestObject('Object Repository/Make To Do/text_date'), 0)

Mobile.tap(findTestObject('Object Repository/Make To Do/click_tanggal 30'), 0)

Mobile.tap(findTestObject('Object Repository/Make To Do/click_ok tanggal'), 0)

Mobile.tap(findTestObject('Object Repository/Make To Do/click_time'), 0)

Mobile.tap(findTestObject('Object Repository/Make To Do/click_ok time'), 0)

Mobile.tap(findTestObject('Object Repository/Make To Do/drop_category'), 0)

Mobile.tap(findTestObject('Object Repository/Make To Do/click_ceklis'), 0)

Mobile.tap(findTestObject('Object Repository/Make To Do/click_check'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Make To Do/h1_to do'), 0)

Mobile.closeApplication()

