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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Home/a_Journeys'))

WebUI.click(findTestObject('Object Repository/Page_Home/span_Journey Library'))

WebUI.click(findTestObject('Object Repository/Page_Journey Library/span_Create'))

WebUI.setText(findTestObject('Object Repository/Page_Journeys  Create Journey/input_Journey_campaign_code'), 'INR01')

WebUI.setText(findTestObject('Object Repository/Page_Journeys  Create Journey/input_Journey_description'), 'Test Informational Campaign')

WebUI.click(findTestObject('Object Repository/Page_Journeys  Create Journey/button_OK_1'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Create Journey/i_Revenue Stimulation (106)_fa fa-angle-down'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Create Journey/a_XL PRE'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Create Journey/i_Revenue Stimulation (106)_fa fa-angle-down'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Create Journey/a_Revenue Stimulation (106)'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Create Journey/a_Revenue Stimulation (106)_trevor-print-hi_c4c4cb'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Create Journey/a_NONE'))

WebUI.dragAndDropToObject(findTestObject('Object Repository/Page_Journeys  Create Journey/span_Segment'), findTestObject(
        'Page_Journeys  Create Journey/js-plumb-canvas_Sample_panzoom-wrapper'))

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Home/a_Journeys'))

WebUI.click(findTestObject('Object Repository/Page_Home/span_Journey Library'))

WebUI.click(findTestObject('Object Repository/Page_Journey Library/span_Create'))

WebUI.setText(findTestObject('Object Repository/Page_Journeys  Create Journey/input_Journey_campaign_code'), 'INR01')

WebUI.setText(findTestObject('Object Repository/Page_Journeys  Create Journey/input_Journey_description'), 'Test Informational Campaign')

WebUI.click(findTestObject('Object Repository/Page_Journeys  Create Journey/button_OK_1'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Create Journey/i_Revenue Stimulation (106)_fa fa-angle-down'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Create Journey/a_XL PRE'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Create Journey/i_Revenue Stimulation (106)_fa fa-angle-down'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Create Journey/a_Revenue Stimulation (106)'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Create Journey/a_Revenue Stimulation (106)_trevor-print-hi_c4c4cb'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Create Journey/a_NONE'))

WebUI.dragAndDropToObject(findTestObject('Object Repository/Page_Journeys  Create Journey/span_Segment'), findTestObject(
        'Object Repository/Page_Journeys  Create Journey/js-plumb-canvas_Sample_panzoom-wrapper'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Create Journey/a_Info'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Create Journey/a_Reply'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Create Journey/div_Connect a source before configuring the_946210'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Journeys  Create Journey/div_re345                                  _dd1106'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Edit Journey  Edit Journey Stage/div_NBOS_timeline-badge palegreen'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Edit Journey  Edit Journey Stage/div_Exclusions'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Edit Journey  Edit Journey Stage/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Edit Journey  Edit Journey Stage/i_Used for segmentation hygiene. Optional F_cfc121'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Edit Journey  Edit Journey Stage/div_Schedule Stage'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Edit Journey  Edit Journey Stage/input_On what date and time should the cycl_01a8fa'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Edit Journey  Edit Journey Stage/input_On what date and time should the cycl_938d9f'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Edit Journey  Edit Journey Stage/circle_PM_clockpicker-canvas-bg clockpicker_68f7ce'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Edit Journey  Edit Journey Stage/circle_PM_clockpicker-canvas-fg'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Edit Journey  Edit Journey Stage/button_AM'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Edit Journey  Edit Journey Stage/button_ok (1)'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Edit Journey  Edit Journey Stage/input_On what date and time should the cycl_938d9f'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Edit Journey  Edit Journey Stage/button_PM'))

WebUI.click(findTestObject('Object Repository/Page_Journeys  Edit Journey  Edit Journey Stage/button_OK'))

