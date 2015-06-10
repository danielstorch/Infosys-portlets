package de.hska.wi.awp.datasource.infosys.bean.mockdata;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import de.hska.wi.awp.datasource.infosys.model.Student;
import de.hska.wi.awp.datasource.infosys.service.StudentLocalServiceUtil;
import de.hska.wi.awp.datasource.infosys.util.mock.MockData;

@ManagedBean(name = "mockDataViewBean")
@RequestScoped
public class MockDataViewBean {
	
    public void deleteMockData() throws SystemException, PortalException {
    	System.out.println("Delete MockData Pressed");
    	MockData.DeleteAllMockData();
    }
    
	public void addMockData() {
		System.out.println("Save MockData Pressed");
		try {
			MockData.SaveAllMockData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
