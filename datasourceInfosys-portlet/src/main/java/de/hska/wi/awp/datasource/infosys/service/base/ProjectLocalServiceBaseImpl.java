package de.hska.wi.awp.datasource.infosys.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import de.hska.wi.awp.datasource.infosys.model.Project;
import de.hska.wi.awp.datasource.infosys.service.ProjectLocalService;
import de.hska.wi.awp.datasource.infosys.service.persistence.AllgemeinesPersistence;
import de.hska.wi.awp.datasource.infosys.service.persistence.FeedbackPersistence;
import de.hska.wi.awp.datasource.infosys.service.persistence.Geplante_arbeitPersistence;
import de.hska.wi.awp.datasource.infosys.service.persistence.ProjectPersistence;
import de.hska.wi.awp.datasource.infosys.service.persistence.StatusberichtePersistence;
import de.hska.wi.awp.datasource.infosys.service.persistence.StatusueberblickPersistence;
import de.hska.wi.awp.datasource.infosys.service.persistence.StudentPersistence;
import de.hska.wi.awp.datasource.infosys.service.persistence.TeilnotePersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the project local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link de.hska.wi.awp.datasource.infosys.service.impl.ProjectLocalServiceImpl}.
 * </p>
 *
 * @author Daniel Storch
 * @see de.hska.wi.awp.datasource.infosys.service.impl.ProjectLocalServiceImpl
 * @see de.hska.wi.awp.datasource.infosys.service.ProjectLocalServiceUtil
 * @generated
 */
public abstract class ProjectLocalServiceBaseImpl extends BaseLocalServiceImpl
    implements ProjectLocalService, IdentifiableBean {
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.AllgemeinesLocalService.class)
    protected de.hska.wi.awp.datasource.infosys.service.AllgemeinesLocalService allgemeinesLocalService;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.AllgemeinesService.class)
    protected de.hska.wi.awp.datasource.infosys.service.AllgemeinesService allgemeinesService;
    @BeanReference(type = AllgemeinesPersistence.class)
    protected AllgemeinesPersistence allgemeinesPersistence;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.FeedbackLocalService.class)
    protected de.hska.wi.awp.datasource.infosys.service.FeedbackLocalService feedbackLocalService;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.FeedbackService.class)
    protected de.hska.wi.awp.datasource.infosys.service.FeedbackService feedbackService;
    @BeanReference(type = FeedbackPersistence.class)
    protected FeedbackPersistence feedbackPersistence;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.Geplante_arbeitLocalService.class)
    protected de.hska.wi.awp.datasource.infosys.service.Geplante_arbeitLocalService geplante_arbeitLocalService;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.Geplante_arbeitService.class)
    protected de.hska.wi.awp.datasource.infosys.service.Geplante_arbeitService geplante_arbeitService;
    @BeanReference(type = Geplante_arbeitPersistence.class)
    protected Geplante_arbeitPersistence geplante_arbeitPersistence;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.ProjectLocalService.class)
    protected de.hska.wi.awp.datasource.infosys.service.ProjectLocalService projectLocalService;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.ProjectService.class)
    protected de.hska.wi.awp.datasource.infosys.service.ProjectService projectService;
    @BeanReference(type = ProjectPersistence.class)
    protected ProjectPersistence projectPersistence;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.StatusberichteLocalService.class)
    protected de.hska.wi.awp.datasource.infosys.service.StatusberichteLocalService statusberichteLocalService;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.StatusberichteService.class)
    protected de.hska.wi.awp.datasource.infosys.service.StatusberichteService statusberichteService;
    @BeanReference(type = StatusberichtePersistence.class)
    protected StatusberichtePersistence statusberichtePersistence;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.StatusueberblickLocalService.class)
    protected de.hska.wi.awp.datasource.infosys.service.StatusueberblickLocalService statusueberblickLocalService;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.StatusueberblickService.class)
    protected de.hska.wi.awp.datasource.infosys.service.StatusueberblickService statusueberblickService;
    @BeanReference(type = StatusueberblickPersistence.class)
    protected StatusueberblickPersistence statusueberblickPersistence;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.StudentLocalService.class)
    protected de.hska.wi.awp.datasource.infosys.service.StudentLocalService studentLocalService;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.StudentService.class)
    protected de.hska.wi.awp.datasource.infosys.service.StudentService studentService;
    @BeanReference(type = StudentPersistence.class)
    protected StudentPersistence studentPersistence;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.TeilnoteLocalService.class)
    protected de.hska.wi.awp.datasource.infosys.service.TeilnoteLocalService teilnoteLocalService;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.TeilnoteService.class)
    protected de.hska.wi.awp.datasource.infosys.service.TeilnoteService teilnoteService;
    @BeanReference(type = TeilnotePersistence.class)
    protected TeilnotePersistence teilnotePersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private ProjectLocalServiceClpInvoker _clpInvoker = new ProjectLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link de.hska.wi.awp.datasource.infosys.service.ProjectLocalServiceUtil} to access the project local service.
     */

    /**
     * Adds the project to the database. Also notifies the appropriate model listeners.
     *
     * @param project the project
     * @return the project that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Project addProject(Project project) throws SystemException {
        project.setNew(true);

        return projectPersistence.update(project);
    }

    /**
     * Creates a new project with the primary key. Does not add the project to the database.
     *
     * @param id the primary key for the new project
     * @return the new project
     */
    @Override
    public Project createProject(long id) {
        return projectPersistence.create(id);
    }

    /**
     * Deletes the project with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the project
     * @return the project that was removed
     * @throws PortalException if a project with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Project deleteProject(long id)
        throws PortalException, SystemException {
        return projectPersistence.remove(id);
    }

    /**
     * Deletes the project from the database. Also notifies the appropriate model listeners.
     *
     * @param project the project
     * @return the project that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Project deleteProject(Project project) throws SystemException {
        return projectPersistence.remove(project);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(Project.class,
            clazz.getClassLoader());
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return projectPersistence.findWithDynamicQuery(dynamicQuery);
    }

    /**
     * Performs a dynamic query on the database and returns a range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.ProjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @return the range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return projectPersistence.findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * Performs a dynamic query on the database and returns an ordered range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.hska.wi.awp.datasource.infosys.model.impl.ProjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return projectPersistence.findWithDynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return projectPersistence.countWithDynamicQuery(dynamicQuery);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @param projection the projection to apply to the query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return projectPersistence.countWithDynamicQuery(dynamicQuery, projection);
    }

    @Override
    public Project fetchProject(long id) throws SystemException {
        return projectPersistence.fetchByPrimaryKey(id);
    }

    /**
     * Returns the project with the primary key.
     *
     * @param id the primary key of the project
     * @return the project
     * @throws PortalException if a project with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Project getProject(long id) throws PortalException, SystemException {
        return projectPersistence.findByPrimaryKey(id);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return projectPersistence.findByPrimaryKey(primaryKeyObj);
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
    @Override
    public List<Project> getProjects(int start, int end)
        throws SystemException {
        return projectPersistence.findAll(start, end);
    }

    /**
     * Returns the number of projects.
     *
     * @return the number of projects
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getProjectsCount() throws SystemException {
        return projectPersistence.countAll();
    }

    /**
     * Updates the project in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param project the project
     * @return the project that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Project updateProject(Project project) throws SystemException {
        return projectPersistence.update(project);
    }

    /**
     * Returns the allgemeines local service.
     *
     * @return the allgemeines local service
     */
    public de.hska.wi.awp.datasource.infosys.service.AllgemeinesLocalService getAllgemeinesLocalService() {
        return allgemeinesLocalService;
    }

    /**
     * Sets the allgemeines local service.
     *
     * @param allgemeinesLocalService the allgemeines local service
     */
    public void setAllgemeinesLocalService(
        de.hska.wi.awp.datasource.infosys.service.AllgemeinesLocalService allgemeinesLocalService) {
        this.allgemeinesLocalService = allgemeinesLocalService;
    }

    /**
     * Returns the allgemeines remote service.
     *
     * @return the allgemeines remote service
     */
    public de.hska.wi.awp.datasource.infosys.service.AllgemeinesService getAllgemeinesService() {
        return allgemeinesService;
    }

    /**
     * Sets the allgemeines remote service.
     *
     * @param allgemeinesService the allgemeines remote service
     */
    public void setAllgemeinesService(
        de.hska.wi.awp.datasource.infosys.service.AllgemeinesService allgemeinesService) {
        this.allgemeinesService = allgemeinesService;
    }

    /**
     * Returns the allgemeines persistence.
     *
     * @return the allgemeines persistence
     */
    public AllgemeinesPersistence getAllgemeinesPersistence() {
        return allgemeinesPersistence;
    }

    /**
     * Sets the allgemeines persistence.
     *
     * @param allgemeinesPersistence the allgemeines persistence
     */
    public void setAllgemeinesPersistence(
        AllgemeinesPersistence allgemeinesPersistence) {
        this.allgemeinesPersistence = allgemeinesPersistence;
    }

    /**
     * Returns the feedback local service.
     *
     * @return the feedback local service
     */
    public de.hska.wi.awp.datasource.infosys.service.FeedbackLocalService getFeedbackLocalService() {
        return feedbackLocalService;
    }

    /**
     * Sets the feedback local service.
     *
     * @param feedbackLocalService the feedback local service
     */
    public void setFeedbackLocalService(
        de.hska.wi.awp.datasource.infosys.service.FeedbackLocalService feedbackLocalService) {
        this.feedbackLocalService = feedbackLocalService;
    }

    /**
     * Returns the feedback remote service.
     *
     * @return the feedback remote service
     */
    public de.hska.wi.awp.datasource.infosys.service.FeedbackService getFeedbackService() {
        return feedbackService;
    }

    /**
     * Sets the feedback remote service.
     *
     * @param feedbackService the feedback remote service
     */
    public void setFeedbackService(
        de.hska.wi.awp.datasource.infosys.service.FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    /**
     * Returns the feedback persistence.
     *
     * @return the feedback persistence
     */
    public FeedbackPersistence getFeedbackPersistence() {
        return feedbackPersistence;
    }

    /**
     * Sets the feedback persistence.
     *
     * @param feedbackPersistence the feedback persistence
     */
    public void setFeedbackPersistence(FeedbackPersistence feedbackPersistence) {
        this.feedbackPersistence = feedbackPersistence;
    }

    /**
     * Returns the geplante_arbeit local service.
     *
     * @return the geplante_arbeit local service
     */
    public de.hska.wi.awp.datasource.infosys.service.Geplante_arbeitLocalService getGeplante_arbeitLocalService() {
        return geplante_arbeitLocalService;
    }

    /**
     * Sets the geplante_arbeit local service.
     *
     * @param geplante_arbeitLocalService the geplante_arbeit local service
     */
    public void setGeplante_arbeitLocalService(
        de.hska.wi.awp.datasource.infosys.service.Geplante_arbeitLocalService geplante_arbeitLocalService) {
        this.geplante_arbeitLocalService = geplante_arbeitLocalService;
    }

    /**
     * Returns the geplante_arbeit remote service.
     *
     * @return the geplante_arbeit remote service
     */
    public de.hska.wi.awp.datasource.infosys.service.Geplante_arbeitService getGeplante_arbeitService() {
        return geplante_arbeitService;
    }

    /**
     * Sets the geplante_arbeit remote service.
     *
     * @param geplante_arbeitService the geplante_arbeit remote service
     */
    public void setGeplante_arbeitService(
        de.hska.wi.awp.datasource.infosys.service.Geplante_arbeitService geplante_arbeitService) {
        this.geplante_arbeitService = geplante_arbeitService;
    }

    /**
     * Returns the geplante_arbeit persistence.
     *
     * @return the geplante_arbeit persistence
     */
    public Geplante_arbeitPersistence getGeplante_arbeitPersistence() {
        return geplante_arbeitPersistence;
    }

    /**
     * Sets the geplante_arbeit persistence.
     *
     * @param geplante_arbeitPersistence the geplante_arbeit persistence
     */
    public void setGeplante_arbeitPersistence(
        Geplante_arbeitPersistence geplante_arbeitPersistence) {
        this.geplante_arbeitPersistence = geplante_arbeitPersistence;
    }

    /**
     * Returns the project local service.
     *
     * @return the project local service
     */
    public de.hska.wi.awp.datasource.infosys.service.ProjectLocalService getProjectLocalService() {
        return projectLocalService;
    }

    /**
     * Sets the project local service.
     *
     * @param projectLocalService the project local service
     */
    public void setProjectLocalService(
        de.hska.wi.awp.datasource.infosys.service.ProjectLocalService projectLocalService) {
        this.projectLocalService = projectLocalService;
    }

    /**
     * Returns the project remote service.
     *
     * @return the project remote service
     */
    public de.hska.wi.awp.datasource.infosys.service.ProjectService getProjectService() {
        return projectService;
    }

    /**
     * Sets the project remote service.
     *
     * @param projectService the project remote service
     */
    public void setProjectService(
        de.hska.wi.awp.datasource.infosys.service.ProjectService projectService) {
        this.projectService = projectService;
    }

    /**
     * Returns the project persistence.
     *
     * @return the project persistence
     */
    public ProjectPersistence getProjectPersistence() {
        return projectPersistence;
    }

    /**
     * Sets the project persistence.
     *
     * @param projectPersistence the project persistence
     */
    public void setProjectPersistence(ProjectPersistence projectPersistence) {
        this.projectPersistence = projectPersistence;
    }

    /**
     * Returns the statusberichte local service.
     *
     * @return the statusberichte local service
     */
    public de.hska.wi.awp.datasource.infosys.service.StatusberichteLocalService getStatusberichteLocalService() {
        return statusberichteLocalService;
    }

    /**
     * Sets the statusberichte local service.
     *
     * @param statusberichteLocalService the statusberichte local service
     */
    public void setStatusberichteLocalService(
        de.hska.wi.awp.datasource.infosys.service.StatusberichteLocalService statusberichteLocalService) {
        this.statusberichteLocalService = statusberichteLocalService;
    }

    /**
     * Returns the statusberichte remote service.
     *
     * @return the statusberichte remote service
     */
    public de.hska.wi.awp.datasource.infosys.service.StatusberichteService getStatusberichteService() {
        return statusberichteService;
    }

    /**
     * Sets the statusberichte remote service.
     *
     * @param statusberichteService the statusberichte remote service
     */
    public void setStatusberichteService(
        de.hska.wi.awp.datasource.infosys.service.StatusberichteService statusberichteService) {
        this.statusberichteService = statusberichteService;
    }

    /**
     * Returns the statusberichte persistence.
     *
     * @return the statusberichte persistence
     */
    public StatusberichtePersistence getStatusberichtePersistence() {
        return statusberichtePersistence;
    }

    /**
     * Sets the statusberichte persistence.
     *
     * @param statusberichtePersistence the statusberichte persistence
     */
    public void setStatusberichtePersistence(
        StatusberichtePersistence statusberichtePersistence) {
        this.statusberichtePersistence = statusberichtePersistence;
    }

    /**
     * Returns the statusueberblick local service.
     *
     * @return the statusueberblick local service
     */
    public de.hska.wi.awp.datasource.infosys.service.StatusueberblickLocalService getStatusueberblickLocalService() {
        return statusueberblickLocalService;
    }

    /**
     * Sets the statusueberblick local service.
     *
     * @param statusueberblickLocalService the statusueberblick local service
     */
    public void setStatusueberblickLocalService(
        de.hska.wi.awp.datasource.infosys.service.StatusueberblickLocalService statusueberblickLocalService) {
        this.statusueberblickLocalService = statusueberblickLocalService;
    }

    /**
     * Returns the statusueberblick remote service.
     *
     * @return the statusueberblick remote service
     */
    public de.hska.wi.awp.datasource.infosys.service.StatusueberblickService getStatusueberblickService() {
        return statusueberblickService;
    }

    /**
     * Sets the statusueberblick remote service.
     *
     * @param statusueberblickService the statusueberblick remote service
     */
    public void setStatusueberblickService(
        de.hska.wi.awp.datasource.infosys.service.StatusueberblickService statusueberblickService) {
        this.statusueberblickService = statusueberblickService;
    }

    /**
     * Returns the statusueberblick persistence.
     *
     * @return the statusueberblick persistence
     */
    public StatusueberblickPersistence getStatusueberblickPersistence() {
        return statusueberblickPersistence;
    }

    /**
     * Sets the statusueberblick persistence.
     *
     * @param statusueberblickPersistence the statusueberblick persistence
     */
    public void setStatusueberblickPersistence(
        StatusueberblickPersistence statusueberblickPersistence) {
        this.statusueberblickPersistence = statusueberblickPersistence;
    }

    /**
     * Returns the student local service.
     *
     * @return the student local service
     */
    public de.hska.wi.awp.datasource.infosys.service.StudentLocalService getStudentLocalService() {
        return studentLocalService;
    }

    /**
     * Sets the student local service.
     *
     * @param studentLocalService the student local service
     */
    public void setStudentLocalService(
        de.hska.wi.awp.datasource.infosys.service.StudentLocalService studentLocalService) {
        this.studentLocalService = studentLocalService;
    }

    /**
     * Returns the student remote service.
     *
     * @return the student remote service
     */
    public de.hska.wi.awp.datasource.infosys.service.StudentService getStudentService() {
        return studentService;
    }

    /**
     * Sets the student remote service.
     *
     * @param studentService the student remote service
     */
    public void setStudentService(
        de.hska.wi.awp.datasource.infosys.service.StudentService studentService) {
        this.studentService = studentService;
    }

    /**
     * Returns the student persistence.
     *
     * @return the student persistence
     */
    public StudentPersistence getStudentPersistence() {
        return studentPersistence;
    }

    /**
     * Sets the student persistence.
     *
     * @param studentPersistence the student persistence
     */
    public void setStudentPersistence(StudentPersistence studentPersistence) {
        this.studentPersistence = studentPersistence;
    }

    /**
     * Returns the teilnote local service.
     *
     * @return the teilnote local service
     */
    public de.hska.wi.awp.datasource.infosys.service.TeilnoteLocalService getTeilnoteLocalService() {
        return teilnoteLocalService;
    }

    /**
     * Sets the teilnote local service.
     *
     * @param teilnoteLocalService the teilnote local service
     */
    public void setTeilnoteLocalService(
        de.hska.wi.awp.datasource.infosys.service.TeilnoteLocalService teilnoteLocalService) {
        this.teilnoteLocalService = teilnoteLocalService;
    }

    /**
     * Returns the teilnote remote service.
     *
     * @return the teilnote remote service
     */
    public de.hska.wi.awp.datasource.infosys.service.TeilnoteService getTeilnoteService() {
        return teilnoteService;
    }

    /**
     * Sets the teilnote remote service.
     *
     * @param teilnoteService the teilnote remote service
     */
    public void setTeilnoteService(
        de.hska.wi.awp.datasource.infosys.service.TeilnoteService teilnoteService) {
        this.teilnoteService = teilnoteService;
    }

    /**
     * Returns the teilnote persistence.
     *
     * @return the teilnote persistence
     */
    public TeilnotePersistence getTeilnotePersistence() {
        return teilnotePersistence;
    }

    /**
     * Sets the teilnote persistence.
     *
     * @param teilnotePersistence the teilnote persistence
     */
    public void setTeilnotePersistence(TeilnotePersistence teilnotePersistence) {
        this.teilnotePersistence = teilnotePersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("de.hska.wi.awp.datasource.infosys.model.Project",
            projectLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "de.hska.wi.awp.datasource.infosys.model.Project");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return Project.class;
    }

    protected String getModelClassName() {
        return Project.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = projectPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
