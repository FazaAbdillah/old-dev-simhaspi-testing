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

WebUI.comment('Dashboard')

WebUI.verifyElementPresent(findTestObject('Object Repository/button_side_menu'), 0)

WebUI.click(findTestObject('Object Repository/button_side_menu'))

WebUI.verifyElementPresent(findTestObject('sidemenu/laporan/menu_laporan_hasil_audit'), 0)

WebUI.click(findTestObject('sidemenu/laporan/menu_laporan_hasil_audit'))

WebUI.comment('Daftar Laporan Hasil Audit')

WebUI.verifyElementPresent(findTestObject('sidemenu/laporan/submenu_daftar'), 0)

WebUI.click(findTestObject('sidemenu/laporan/submenu_daftar'))

WebUI.verifyElementPresent(findTestObject('laporanhasilaudit/daftar/header_laporan_hasil_audit'), 0)

WebUI.verifyElementPresent(findTestObject('laporanhasilaudit/btn_aksi_tabel_lha'), 0)

WebUI.click(findTestObject('laporanhasilaudit/btn_aksi_tabel_lha'))

WebUI.verifyElementPresent(findTestObject('laporanhasilaudit/daftar/subitem_detail_lha'), 0)

WebUI.click(findTestObject('laporanhasilaudit/daftar/subitem_detail_lha'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('laporanhasilaudit/detail/title_detail_lha'), 0)

WebUI.verifyElementPresent(findTestObject('laporanhasilaudit/detail/datefield_tanggal_lha'), 0)

WebUI.setText(findTestObject('laporanhasilaudit/detail/datefield_tanggal_lha'), '20/03/2024')

WebUI.verifyElementPresent(findTestObject('laporanhasilaudit/detail/btn_upload_file_lha'), 0)

WebUI.uploadFile(findTestObject('laporanhasilaudit/detail/btn_upload_file_lha'), 'C:\\Users\\alston\\software project\\katalon-project\\simaspi-old-dev\\Resources\\Dokumen_testing.pdf')

