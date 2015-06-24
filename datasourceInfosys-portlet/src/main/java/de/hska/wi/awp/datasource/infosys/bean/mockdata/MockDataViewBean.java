package de.hska.wi.awp.datasource.infosys.bean.mockdata;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.util.mock.MockData;

@ManagedBean(name = "mockDataViewBean")
@RequestScoped
public class MockDataViewBean {
	
	 /**
     * Logger Util
     */
	private static final Log log = LogFactoryUtil.getLog(MockDataViewBean.class);
	
    public void deleteMockData() {
    	log.debug("BEGIN: Delete MockData");
    	System.out.println("Delete MockData Pressed");
    	try {
			MockData.DeleteAllMockData();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			log.error(e);
			e.printStackTrace();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			log.error(e);
			e.printStackTrace();
		}
    	
    	log.debug("END: Delete MockData");
    }
    
	public void addMockData() {
		log.debug("BEGIN: Save MockData");
		System.out.println("Save MockData Pressed");
		try {
			MockData.SaveAllMockData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.error(e);
			e.printStackTrace();
		}
		log.debug("END: Save MockData");
	}
}
