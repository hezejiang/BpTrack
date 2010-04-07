package biz.gsconsulting.bptrack.test.acceptance;

import com.jayway.android.robotium.solo.Solo;

import biz.gsconsulting.bptrack.activities.AddMeasurement;
import android.test.ActivityInstrumentationTestCase2;


public class AddMeasurementTests extends ActivityInstrumentationTestCase2<AddMeasurement> {

	private Solo interactor;

	public AddMeasurementTests()
	{
		super("biz.gsconsulting.bptrack", AddMeasurement.class);
	}

	public void testShouldHaveATitle() throws Exception {
		//Given
		theAddMeasurementActivityHasBeenStarted();
		
		//Then
		assertTrue("Title was not found", interactor.searchText("Add Measurement"));
	}

	private void theAddMeasurementActivityHasBeenStarted() {
		interactor = new Solo(getInstrumentation(), getActivity());
	}

	@Override
	protected void tearDown() throws Exception {
//		try {
//			interactor.finalize();
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}
//		
//		getActivity().finish();
//		super.tearDown();
	}
}
