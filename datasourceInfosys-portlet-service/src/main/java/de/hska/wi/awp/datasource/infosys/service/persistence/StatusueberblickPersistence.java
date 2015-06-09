package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import de.hska.wi.awp.datasource.infosys.model.Statusueberblick;

/**
 * The persistence interface for the statusueberblick service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see StatusueberblickPersistenceImpl
 * @see StatusueberblickUtil
 * @generated
 */
public interface StatusueberblickPersistence extends BasePersistence<Statusueberblick> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link StatusueberblickUtil} to access the statusueberblick persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the statusueberblick in the entity cache if it is enabled.
    *
    * @param statusueberblick the statusueberblick
    */
    public void cacheResult(
        de.hska.wi.awp.datasource.infosys.model.Statusueberblick statusueberblick);

    /**
    * Caches the statusueberblicks in the entity cache if it is enabled.
    *
    * @param statusueberblicks the statusueberblicks
    */
    public void cacheResult(
        java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusueberblick> statusueberblicks);

    /**
    * Creates a new statusueberblick with the primary key. Does not add the statusueberblick to the database.
    *
    * @param id the primary key for the new statusueberblick
    * @return the new statusueberblick
    */
    public de.hska.wi.awp.datasource.infosys.model.Statusueberblick create(
        long id);

    /**
    * Removes the statusueberblick with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the statusueberblick
    * @return the statusueberblick that was removed
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusueberblickException if a statusueberblick with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Statusueberblick remove(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusueberblickException;

    public de.hska.wi.awp.datasource.infosys.model.Statusueberblick updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Statusueberblick statusueberblick)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the statusueberblick with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchStatusueberblickException} if it could not be found.
    *
    * @param id the primary key of the statusueberblick
    * @return the statusueberblick
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchStatusueberblickException if a statusueberblick with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Statusueberblick findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchStatusueberblickException;

    /**
    * Returns the statusueberblick with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the statusueberblick
    * @return the statusueberblick, or <code>null</code> if a statusueberblick with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Statusueberblick fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the statusueberblicks.
    *
    * @return the statusueberblicks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusueberblick> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the statusueberblicks.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.StatusueberblickModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of statusueberblicks
    * @param end the upper bound of the range of statusueberblicks (not inclusive)
    * @return the range of statusueberblicks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusueberblick> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the statusueberblicks.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.StatusueberblickModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of statusueberblicks
    * @param end the upper bound of the range of statusueberblicks (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of statusueberblicks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Statusueberblick> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the statusueberblicks from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of statusueberblicks.
    *
    * @return the number of statusueberblicks
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
