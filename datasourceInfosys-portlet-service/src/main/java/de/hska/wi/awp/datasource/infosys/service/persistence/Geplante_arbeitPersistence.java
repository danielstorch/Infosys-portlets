package de.hska.wi.awp.datasource.infosys.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit;

/**
 * The persistence interface for the geplante_arbeit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Daniel Storch
 * @see Geplante_arbeitPersistenceImpl
 * @see Geplante_arbeitUtil
 * @generated
 */
public interface Geplante_arbeitPersistence extends BasePersistence<Geplante_arbeit> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link Geplante_arbeitUtil} to access the geplante_arbeit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the geplante_arbeit in the entity cache if it is enabled.
    *
    * @param geplante_arbeit the geplante_arbeit
    */
    public void cacheResult(
        de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit geplante_arbeit);

    /**
    * Caches the geplante_arbeits in the entity cache if it is enabled.
    *
    * @param geplante_arbeits the geplante_arbeits
    */
    public void cacheResult(
        java.util.List<de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit> geplante_arbeits);

    /**
    * Creates a new geplante_arbeit with the primary key. Does not add the geplante_arbeit to the database.
    *
    * @param id the primary key for the new geplante_arbeit
    * @return the new geplante_arbeit
    */
    public de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit create(
        long id);

    /**
    * Removes the geplante_arbeit with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the geplante_arbeit
    * @return the geplante_arbeit that was removed
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchGeplante_arbeitException if a geplante_arbeit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit remove(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchGeplante_arbeitException;

    public de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit updateImpl(
        de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit geplante_arbeit)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the geplante_arbeit with the primary key or throws a {@link de.hska.wi.awp.datasource.infosys.NoSuchGeplante_arbeitException} if it could not be found.
    *
    * @param id the primary key of the geplante_arbeit
    * @return the geplante_arbeit
    * @throws de.hska.wi.awp.datasource.infosys.NoSuchGeplante_arbeitException if a geplante_arbeit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.hska.wi.awp.datasource.infosys.NoSuchGeplante_arbeitException;

    /**
    * Returns the geplante_arbeit with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the geplante_arbeit
    * @return the geplante_arbeit, or <code>null</code> if a geplante_arbeit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the geplante_arbeits.
    *
    * @return the geplante_arbeits
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the geplante_arbeits.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Geplante_arbeitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of geplante_arbeits
    * @param end the upper bound of the range of geplante_arbeits (not inclusive)
    * @return the range of geplante_arbeits
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the geplante_arbeits.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.Geplante_arbeitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of geplante_arbeits
    * @param end the upper bound of the range of geplante_arbeits (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of geplante_arbeits
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the geplante_arbeits from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of geplante_arbeits.
    *
    * @return the number of geplante_arbeits
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
