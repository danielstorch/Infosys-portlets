package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import de.hska.wi.awp.datasource.infosys.model.Project;

import java.util.List;

/**
 * The persistence utility for the project service. This utility wraps {@link ProjectPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see ProjectPersistence
 * @see ProjectPersistenceImpl
 * @generated
 */
public class ProjectUtil {
    private static ProjectPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Project project) {
        getPersistence().clearCache(project);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Project> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Project> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Project> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Project update(Project project) throws SystemException {
        return getPersistence().update(project);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Project update(Project project, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(project, serviceContext);
    }

    /**
    * Returns the project where projecthskaId = &#63; or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchProjectException} if it could not be found.
    *
    * @param projecthskaId the projecthska ID
    * @return the matching project
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchProjectException if a matching project could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Project findByProjecthskaId(
        java.lang.String projecthskaId)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchProjectException {
        return getPersistence().findByProjecthskaId(projecthskaId);
    }

    /**
    * Returns the project where projecthskaId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param projecthskaId the projecthska ID
    * @return the matching project, or <code>null</code> if a matching project could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Project fetchByProjecthskaId(
        java.lang.String projecthskaId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByProjecthskaId(projecthskaId);
    }

    /**
    * Returns the project where projecthskaId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param projecthskaId the projecthska ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching project, or <code>null</code> if a matching project could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Project fetchByProjecthskaId(
        java.lang.String projecthskaId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByProjecthskaId(projecthskaId, retrieveFromCache);
    }

    /**
    * Removes the project where projecthskaId = &#63; from the database.
    *
    * @param projecthskaId the projecthska ID
    * @return the project that was removed
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Project removeByProjecthskaId(
        java.lang.String projecthskaId)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchProjectException {
        return getPersistence().removeByProjecthskaId(projecthskaId);
    }

    /**
    * Returns the number of projects where projecthskaId = &#63;.
    *
    * @param projecthskaId the projecthska ID
    * @return the number of matching projects
    * @throws SystemException if a system exception occurred
    */
    public static int countByProjecthskaId(java.lang.String projecthskaId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByProjecthskaId(projecthskaId);
    }

    /**
    * Caches the project in the entity cache if it is enabled.
    *
    * @param project the project
    */
    public static void cacheResult(
        de.hska.wi.awp.datasource.infosys.model.Project project) {
        getPersistence().cacheResult(project);
    }

    /**
    * Caches the projects in the entity cache if it is enabled.
    *
    * @param projects the projects
    */
    public static void cacheResult(
        java.util.List<de.hska.wi.awp.datasource.infosys.model.Project> projects) {
        getPersistence().cacheResult(projects);
    }

    /**
    * Creates a new project with the primary key. Does not add the project to the database.
    *
    * @param id the primary key for the new project
    * @return the new project
    */
    public static de.hska.wi.awp.datasource.infosys.model.Project create(
        long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the project with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the project
    * @return the project that was removed
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchProjectException if a project with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Project remove(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchProjectException {
        return getPersistence().remove(id);
    }

    public static de.hska.wi.awp.datasource.infosys.model.Project updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Project project)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(project);
    }

    /**
    * Returns the project with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchProjectException} if it could not be found.
    *
    * @param id the primary key of the project
    * @return the project
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchProjectException if a project with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Project findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchProjectException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the project with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the project
    * @return the project, or <code>null</code> if a project with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Project fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the projects.
    *
    * @return the projects
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Project> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the projects.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.ProjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of projects
    * @param end the upper bound of the range of projects (not inclusive)
    * @return the range of projects
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Project> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the projects.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.ProjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of projects
    * @param end the upper bound of the range of projects (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of projects
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Project> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the projects from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of projects.
    *
    * @return the number of projects
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static ProjectPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (ProjectPersistence) PortletBeanLocatorUtil.locate(de.hska.wi.awp.datasource.infosys.service.ClpSerializer.getServletContextName(),
                    ProjectPersistence.class.getName());

            ReferenceRegistry.registerReference(ProjectUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(ProjectPersistence persistence) {
    }
}
