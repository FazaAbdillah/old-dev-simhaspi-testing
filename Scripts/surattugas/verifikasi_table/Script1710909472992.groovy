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

WebUI.callTestCase(findTestCase('login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('button_side_menu'), 0)

WebUI.click(findTestObject('button_side_menu'))

WebUI.verifyElementPresent(findTestObject('Object Repository/surattugas/menu_surat_tugas'), 0)

WebUI.click(findTestObject('Object Repository/surattugas/menu_surat_tugas'))

WebUI.click(findTestObject('surattugas/menu_persetujuan_surat_tugas'))

WebUI.getText(findTestObject('Table_Verif/Nomor_ST'))

WebUI.verifyElementPresent(findTestObject('Table_Verif/Nomor_ST'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Table_Verif/Cabang'))

WebUI.verifyElementPresent(findTestObject('Table_Verif/Cabang'), 0)

WebUI.getText(findTestObject('Table_Verif/Tanggal_mulai'))

WebUI.verifyElementPresent(findTestObject('Table_Verif/Tanggal_mulai'), 0)

WebUI.getText(findTestObject('Table_Verif/Tanggal_selesai'))

WebUI.verifyElementPresent(findTestObject('Table_Verif/Tanggal_selesai'), 0)

WebUI.getText(findTestObject('Table_Verif/Status'))

WebUI.verifyElementPresent(findTestObject('Table_Verif/Status'), 0)

WebUI.setText(findTestObject('Table_Verif/Search'), 'Surabaya')

isi = WebUI.getText(findTestObject('Table_Verif/Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyMatch('Surabaya', 'Surabaya', true)

WebUI.closeBrowser()

