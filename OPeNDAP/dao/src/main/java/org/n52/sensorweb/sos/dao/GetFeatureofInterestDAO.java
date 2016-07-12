/*
 * Copyright (C) 2016 52north.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package org.n52.sensorweb.sos.dao;

import org.n52.sos.ogc.sos.SosConstants;
import org.n52.sos.request.GetFeatureOfInterestRequest;
import org.n52.sos.response.GetFeatureOfInterestResponse;
import org.n52.sos.ds.AbstractGetFeatureOfInterestDAO;
import org.n52.sos.ogc.ows.OwsExceptionReport;
import org.n52.sos.ogc.om.features.FeatureCollection;
import org.n52.sos.ogc.sos.Sos1Constants;

 
/**
 *
 * @author ankit
 */
public class GetFeatureofInterestDAO extends AbstractGetFeatureOfInterestDAO{

    public GetFeatureofInterestDAO(String service) {
        super(SosConstants.SOS);
    }

    @Override
    public GetFeatureOfInterestResponse getFeatureOfInterest(GetFeatureOfInterestRequest request) throws OwsExceptionReport {
        FeatureCollection featureCollection = null;
        if(isSos100(request)){
            throw new UnsupportedOperationException("Not supported yet.");
        }
        
        final GetFeatureOfInterestResponse response = null;
        return response;
    }

    @Override
    public String getDatasourceDaoIdentifier() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private FeatureCollection getFeatures(final GetFeatureOfInterestRequest request){
        FeatureCollection featureCollection = null;
        return featureCollection;
    }
    private boolean isSos100(final GetFeatureOfInterestRequest request) {
        return request.getVersion().equals(Sos1Constants.SERVICEVERSION);
    }
}
