
import org.n52.sos.request.GetFeatureOfInterestRequest;
import org.n52.sos.response.GetFeatureOfInterestResponse;
import org.n52.sos.ogc.sos.SosConstants;

import org.n52.sos.ds.AbstractGetFeatureOfInterestDAO;


public class GetFeatureOfInterestDAO implements AbstractGetFeatureOfInterestDAO{
	

	public GetFeatureOfInterestDAO() {
		super(SosConstants.SOS);
	}

	@Override
	public String getDatasourceDaoIdentifier() {
		return ;
	}
	
	@Override
	public GetFeatureOfInterestResponse getFeatureOfInterest(final GetFeatureOfInterestRequest request) throws OwsExceptionReport {
	
	}

}