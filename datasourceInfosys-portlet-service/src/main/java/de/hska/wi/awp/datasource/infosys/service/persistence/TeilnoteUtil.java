package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import de.hska.wi.awp.datasource.infosys.model.Teilnote;

import java.util.List;

/**
 * The persistence utility for the teilnote service. This utility wraps {@link TeilnotePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see TeilnotePersistence
 * @see TeilnotePersistenceImpl
 * @generated
 */
public class TeilnoteUtil {
    private static TeilnotePersistence _persistence;

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
    public static void clearCache(Teilnote teilnote) {
        getPersistence().clearCache(teilnote);
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
    public static List<Teilnote> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Teilnote> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Teilnote> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Teilnote update(Teilnote teilnote) throws SystemException {
        return getPersistence().update(teilnote);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Teilnote update(Teilnote teilnote,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(teilnote, serviceContext);
    }

    /**
    * Returns all the teilnotes where feedback_id = &#63;.
    *
    * @param feedback_id the feedback_id
    * @return the matching teilnotes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Teilnote> findByFeedback_id(
        long feedback_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByFeedback_id(feedback_id);
    }

    /**
    * Returns a range of all the teilnotes where feedback_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.TeilnoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param feedback_id the feedback_id
    * @param start the lower bound of the range of teilnotes
    * @param end the upper bound of the range of teilnotes (not inclusive)
    * @return the range of matching teilnotes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Teilnote> findByFeedback_id(
        long feedback_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByFeedback_id(feedback_id, start, end);
    }

    /**
    * Returns an ordered range of all the teilnotes where feedback_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.TeilnoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param feedback_id the feedback_id
    * @param start the lower bound of the range of teilnotes
    * @param end the upper bound of the range of teilnotes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching teilnotes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Teilnote> findByFeedback_id(
        long feedback_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByFeedback_id(feedback_id, start, end, orderByComparator);
    }

    /**
    * Returns the first teilnote in the ordered set where feedback_id = &#63;.
    *
    * @param feedback_id the feedback_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching teilnote
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException if a matching teilnote could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Teilnote findByFeedback_id_First(
        long feedback_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException {
        return getPersistence()
                   .findByFeedback_id_First(feedback_id, orderByComparator);
    }

    /**
    * Returns the first teilnote in the ordered set where feedback_id = &#63;.
    *
    * @param feedback_id the feedback_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching teilnote, or <code>null</code> if a matching teilnote could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Teilnote fetchByFeedback_id_First(
        long feedback_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByFeedback_id_First(feedback_id, orderByComparator);
    }

    /**
    * Returns the last teilnote in the ordered set where feedback_id = &#63;.
    *
    * @param feedback_id the feedback_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching teilnote
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException if a matching teilnote could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Teilnote findByFeedback_id_Last(
        long feedback_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException {
        return getPersistence()
                   .findByFeedback_id_Last(feedback_id, orderByComparator);
    }

    /**
    * Returns the last teilnote in the ordered set where feedback_id = &#63;.
    *
    * @param feedback_id the feedback_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching teilnote, or <code>null</code> if a matching teilnote could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Teilnote fetchByFeedback_id_Last(
        long feedback_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByFeedback_id_Last(feedback_id, orderByComparator);
    }

    /**
    * Returns the teilnotes before and after the current teilnote in the ordered set where feedback_id = &#63;.
    *
    * @param id the primary key of the current teilnote
    * @param feedback_id the feedback_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next teilnote
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException if a teilnote with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Teilnote[] findByFeedback_id_PrevAndNext(
        long id, long feedback_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException {
        return getPersistence()
                   .findByFeedback_id_PrevAndNext(id, feedback_id,
            orderByComparator);
    }

    /**
    * Removes all the teilnotes where feedback_id = &#63; from the database.
    *
    * @param feedback_id the feedback_id
    * @throws SystemException if a system exception occurred
    */
    public static void removeByFeedback_id(long feedback_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByFeedback_id(feedback_id);
    }

    /**
    * Returns the number of teilnotes where feedback_id = &#63;.
    *
    * @param feedback_id the feedback_id
    * @return the number of matching teilnotes
    * @throws SystemException if a system exception occurred
    */
    public static int countByFeedback_id(long feedback_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByFeedback_id(feedback_id);
    }

    /**
    * Caches the teilnote in the entity cache if it is enabled.
    *
    * @param teilnote the teilnote
    */
    public static void cacheResult(
        de.hska.wi.awp.datasource.infosys.model.Teilnote teilnote) {
        getPersistence().cacheResult(teilnote);
    }

    /**
    * Caches the teilnotes in the entity cache if it is enabled.
    *
    * @param teilnotes the teilnotes
    */
    public static void cacheResult(
        java.util.List<de.hska.wi.awp.datasource.infosys.model.Teilnote> teilnotes) {
        getPersistence().cacheResult(teilnotes);
    }

    /**
    * Creates a new teilnote with the primary key. Does not add the teilnote to the database.
    *
    * @param id the primary key for the new teilnote
    * @return the new teilnote
    */
    public static de.hska.wi.awp.datasource.infosys.model.Teilnote create(
        long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the teilnote with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the teilnote
    * @return the teilnote that was removed
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException if a teilnote with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Teilnote remove(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException {
        return getPersistence().remove(id);
    }

    public static de.hska.wi.awp.datasource.infosys.model.Teilnote updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Teilnote teilnote)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(teilnote);
    }

    /**
    * Returns the teilnote with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException} if it could not be found.
    *
    * @param id the primary key of the teilnote
    * @return the teilnote
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException if a teilnote with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Teilnote findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchTeilnoteException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the teilnote with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the teilnote
    * @return the teilnote, or <code>null</code> if a teilnote with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.hska.wi.awp.datasource.infosys.model.Teilnote fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the teilnotes.
    *
    * @return the teilnotes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Teilnote> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the teilnotes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.TeilnoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of teilnotes
    * @param end the upper bound of the range of teilnotes (not inclusive)
    * @return the range of teilnotes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Teilnote> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the teilnotes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.TeilnoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of teilnotes
    * @param end the upper bound of the range of teilnotes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of teilnotes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.hska.wi.awp.datasource.infosys.model.Teilnote> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the teilnotes from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of teilnotes.
    *
    * @return the number of teilnotes
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static TeilnotePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (TeilnotePersistence) PortletBeanLocatorUtil.locate(de.hska.wi.awp.datasource.infosys.service.ClpSerializer.getServletContextName(),
                    TeilnotePersistence.class.getName());

            ReferenceRegistry.registerReference(TeilnoteUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(TeilnotePersistence persistence) {
    }
}
