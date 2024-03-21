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

def location = [0, 5, 2, 3, 1, 3]

WebUI.callTestCase(findTestCase('login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Dashboard')

WebUI.verifyElementPresent(findTestObject('button_side_menu'), 0)

WebUI.click(findTestObject('button_side_menu'))

WebUI.acceptAlert()

WebUI.comment('Daftar surat tugas')

WebUI.verifyElementPresent(findTestObject('Object Repository/surattugas/menu_surat_tugas'), 0)

WebUI.click(findTestObject('Object Repository/surattugas/menu_surat_tugas'))

WebUI.verifyElementPresent(findTestObject('surattugas/menu_persetujuan_surat_tugas'), 0)

WebUI.click(findTestObject('surattugas/menu_persetujuan_surat_tugas'))

WebUI.verifyElementPresent(findTestObject('surattugas/header_surat_tugas'), 0)

WebUI.verifyElementPresent(findTestObject('surattugas/table_surat_tugas'), 0)

WebUI.verifyElementPresent(findTestObject('surattugas/btn_tambah_surat_tugas'), 0)

WebUI.click(findTestObject('surattugas/btn_tambah_surat_tugas'))

WebUI.selectOptionByValue(findTestObject('surattugas/span_Tambah Surat Tugas'), 'ST180312001', false)

WebUI.click(findTestObject('surattugas/btn_next_surat_tugas'))

WebUI.comment('Tambah Surat Tugas')

WebUI.verifyElementPresent(findTestObject('surattugas/dropdown_operasional'), 0)

WebUI.selectOptionByValue(findTestObject('surattugas/dropdown_operasional'), 'STC181030002', false)

WebUI.verifyElementPresent(findTestObject('surattugas/radiobtn_tipe_auditee', [('valueLocation') : 1]), 0)

for (int i = 0; i <= location.size(); i++) {
    WebUI.click(findTestObject('surattugas/radiobtn_tipe_auditee', [('valueLocation') : location[i]]))
}

WebUI.verifyElementPresent(findTestObject('surattugas/dropdown_lokasi_auditee'), 0)

WebUI.selectOptionByIndex(findTestObject('surattugas/dropdown_lokasi_auditee'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('surattugas/textfield_ruang_lingkup'), 0)

WebUI.setText(findTestObject('surattugas/textfield_ruang_lingkup'), 'tujuan field')

WebUI.verifyElementPresent(findTestObject('surattugas/datepicker_tanggal_mulai'), 0)

WebUI.setText(findTestObject('surattugas/datepicker_tanggal_mulai'), '19/03/2024')

WebUI.verifyElementPresent(findTestObject('surattugas/datepicker_tanggal_selesai'), 0)

WebUI.setText(findTestObject('surattugas/datepicker_tanggal_selesai'), '22/03/2024')

WebUI.verifyElementPresent(findTestObject('surattugas/datepicker_awal_periode'), 0)

WebUI.setText(findTestObject('surattugas/datepicker_awal_periode'), '20/10/2024')

WebUI.verifyElementPresent(findTestObject('surattugas/datepicker_awal_periode'), 0)

WebUI.setText(findTestObject('surattugas/datepicker_awal_periode'), '29/10/2024')

WebUI.verifyElementPresent(findTestObject('surattugas/textfield_ots'), 0)

WebUI.setText(findTestObject('surattugas/textfield_ots'), '1')

WebUI.verifyElementPresent(findTestObject('surattugas/dropdown_penanggung_jawab'), 0)

WebUI.selectOptionByIndex(findTestObject('surattugas/dropdown_penanggung_jawab'), 1)

WebUI.verifyElementPresent(findTestObject('surattugas/dropdown_supervisor'), 0)

WebUI.selectOptionByIndex(findTestObject('surattugas/dropdown_supervisor'), 1)

WebUI.verifyElementPresent(findTestObject('surattugas/dropdown_ketua_tim'), 0)

WebUI.selectOptionByIndex(findTestObject('surattugas/dropdown_ketua_tim'), 1)

WebUI.verifyElementPresent(findTestObject('surattugas/textfield_catatan'), 0)

WebUI.closeBrowser()

