package de.hska.wi.awp.datasource.infosys.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import de.hska.wi.awp.datasource.infosys.model.Geplante_arbeit;
import de.hska.wi.awp.datasource.infosys.service.Geplante_arbeitService;
import de.hska.wi.awp.datasource.infosys.service.persistence.AllgemeinesPersistence;
import de.hska.wi.awp.datasource.infosys.service.persistence.BewertungskriteriumPersistence;
import de.hska.wi.awp.datasource.infosys.service.persistence.FeedbackPersistence;
import de.hska.wi.awp.datasource.infosys.service.persistence.Geplante_arbeitPersistence;
import de.hska.wi.awp.datasource.infosys.service.persistence.ProjectPersistence;
import de.hska.wi.awp.datasource.infosys.service.persistence.RollePersistence;
import de.hska.wi.awp.datasource.infosys.service.persistence.StatusberichtePersistence;
import de.hska.wi.awp.datasource.infosys.service.persistence.StatusueberblickPersistence;
import de.hska.wi.awp.datasource.infosys.service.persistence.StudentPersistence;
import de.hska.wi.awp.datasource.infosys.service.persistence.Teilnote_feedbackPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the geplante_arbeit remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link de.hska.wi.awp.datasource.infosys.service.impl.Geplante_arbeitServiceImpl}.
 * </p>
 *
 * @author Daniel Storch
 * @see de.hska.wi.awp.datasource.infosys.service.impl.Geplante_arbeitServiceImpl
 * @see de.hska.wi.awp.datasource.infosys.service.Geplante_arbeitServiceUtil
 * @generated
 */
public abstract class Geplante_arbeitServiceBaseImpl extends BaseServiceImpl
    implements Geplante_arbeitService, IdentifiableBean {
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.AllgemeinesLocalService.class)
    protected de.hska.wi.awp.datasource.infosys.service.AllgemeinesLocalService allgemeinesLocalService;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.AllgemeinesService.class)
    protected de.hska.wi.awp.datasource.infosys.service.AllgemeinesService allgemeinesService;
    @BeanReference(type = AllgemeinesPersistence.class)
    protected AllgemeinesPersistence allgemeinesPersistence;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.BewertungskriteriumLocalService.class)
    protected de.hska.wi.awp.datasource.infosys.service.BewertungskriteriumLocalService bewertungskriteriumLocalService;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.BewertungskriteriumService.class)
    protected de.hska.wi.awp.datasource.infosys.service.BewertungskriteriumService bewertungskriteriumService;
    @BeanReference(type = BewertungskriteriumPersistence.class)
    protected BewertungskriteriumPersistence bewertungskriteriumPersistence;
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
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.RolleLocalService.class)
    protected de.hska.wi.awp.datasource.infosys.service.RolleLocalService rolleLocalService;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.RolleService.class)
    protected de.hska.wi.awp.datasource.infosys.service.RolleService rolleService;
    @BeanReference(type = RollePersistence.class)
    protected RollePersistence rollePersistence;
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
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.Teilnote_feedbackLocalService.class)
    protected de.hska.wi.awp.datasource.infosys.service.Teilnote_feedbackLocalService teilnote_feedbackLocalService;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.Teilnote_feedbackService.class)
    protected de.hska.wi.awp.datasource.infosys.service.Teilnote_feedbackService teilnote_feedbackService;
    @BeanReference(type = Teilnote_feedbackPersistence.class)
    protected Teilnote_feedbackPersistence teilnote_feedbackPersistence;
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
    private Geplante_arbeitServiceClpInvoker _clpInvoker = new Geplante_arbeitServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link de.hska.wi.awp.datasource.infosys.service.Geplante_arbeitServiceUtil} to access the geplante_arbeit remote service.
     */

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
     * Returns the bewertungskriterium local service.
     *
     * @return the bewertungskriterium local service
     */
    public de.hska.wi.awp.datasource.infosys.service.BewertungskriteriumLocalService getBewertungskriteriumLocalService() {
        return bewertungskriteriumLocalService;
    }

    /**
     * Sets the bewertungskriterium local service.
     *
     * @param bewertungskriteriumLocalService the bewertungskriterium local service
     */
    public void setBewertungskriteriumLocalService(
        de.hska.wi.awp.datasource.infosys.service.BewertungskriteriumLocalService bewertungskriteriumLocalService) {
        this.bewertungskriteriumLocalService = bewertungskriteriumLocalService;
    }

    /**
     * Returns the bewertungskriterium remote service.
     *
     * @return the bewertungskriterium remote service
     */
    public de.hska.wi.awp.datasource.infosys.service.BewertungskriteriumService getBewertungskriteriumService() {
        return bewertungskriteriumService;
    }

    /**
     * Sets the bewertungskriterium remote service.
     *
     * @param bewertungskriteriumService the bewertungskriterium remote service
     */
    public void setBewertungskriteriumService(
        de.hska.wi.awp.datasource.infosys.service.BewertungskriteriumService bewertungskriteriumService) {
        this.bewertungskriteriumService = bewertungskriteriumService;
    }

    /**
     * Returns the bewertungskriterium persistence.
     *
     * @return the bewertungskriterium persistence
     */
    public BewertungskriteriumPersistence getBewertungskriteriumPersistence() {
        return bewertungskriteriumPersistence;
    }

    /**
     * Sets the bewertungskriterium persistence.
     *
     * @param bewertungskriteriumPersistence the bewertungskriterium persistence
     */
    public void setBewertungskriteriumPersistence(
        BewertungskriteriumPersistence bewertungskriteriumPersistence) {
        this.bewertungskriteriumPersistence = bewertungskriteriumPersistence;
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
     * Returns the rolle local service.
     *
     * @return the rolle local service
     */
    public de.hska.wi.awp.datasource.infosys.service.RolleLocalService getRolleLocalService() {
        return rolleLocalService;
    }

    /**
     * Sets the rolle local service.
     *
     * @param rolleLocalService the rolle local service
     */
    public void setRolleLocalService(
        de.hska.wi.awp.datasource.infosys.service.RolleLocalService rolleLocalService) {
        this.rolleLocalService = rolleLocalService;
    }

    /**
     * Returns the rolle remote service.
     *
     * @return the rolle remote service
     */
    public de.hska.wi.awp.datasource.infosys.service.RolleService getRolleService() {
        return rolleService;
    }

    /**
     * Sets the rolle remote service.
     *
     * @param rolleService the rolle remote service
     */
    public void setRolleService(
        de.hska.wi.awp.datasource.infosys.service.RolleService rolleService) {
        this.rolleService = rolleService;
    }

    /**
     * Returns the rolle persistence.
     *
     * @return the rolle persistence
     */
    public RollePersistence getRollePersistence() {
        return rollePersistence;
    }

    /**
     * Sets the rolle persistence.
     *
     * @param rollePersistence the rolle persistence
     */
    public void setRollePersistence(RollePersistence rollePersistence) {
        this.rollePersistence = rollePersistence;
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
     * Returns the teilnote_feedback local service.
     *
     * @return the teilnote_feedback local service
     */
    public de.hska.wi.awp.datasource.infosys.service.Teilnote_feedbackLocalService getTeilnote_feedbackLocalService() {
        return teilnote_feedbackLocalService;
    }

    /**
     * Sets the teilnote_feedback local service.
     *
     * @param teilnote_feedbackLocalService the teilnote_feedback local service
     */
    public void setTeilnote_feedbackLocalService(
        de.hska.wi.awp.datasource.infosys.service.Teilnote_feedbackLocalService teilnote_feedbackLocalService) {
        this.teilnote_feedbackLocalService = teilnote_feedbackLocalService;
    }

    /**
     * Returns the teilnote_feedback remote service.
     *
     * @return the teilnote_feedback remote service
     */
    public de.hska.wi.awp.datasource.infosys.service.Teilnote_feedbackService getTeilnote_feedbackService() {
        return teilnote_feedbackService;
    }

    /**
     * Sets the teilnote_feedback remote service.
     *
     * @param teilnote_feedbackService the teilnote_feedback remote service
     */
    public void setTeilnote_feedbackService(
        de.hska.wi.awp.datasource.infosys.service.Teilnote_feedbackService teilnote_feedbackService) {
        this.teilnote_feedbackService = teilnote_feedbackService;
    }

    /**
     * Returns the teilnote_feedback persistence.
     *
     * @return the teilnote_feedback persistence
     */
    public Teilnote_feedbackPersistence getTeilnote_feedbackPersistence() {
        return teilnote_feedbackPersistence;
    }

    /**
     * Sets the teilnote_feedback persistence.
     *
     * @param teilnote_feedbackPersistence the teilnote_feedback persistence
     */
    public void setTeilnote_feedbackPersistence(
        Teilnote_feedbackPersistence teilnote_feedbackPersistence) {
        this.teilnote_feedbackPersistence = teilnote_feedbackPersistence;
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
    }

    public void destroy() {
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
        return Geplante_arbeit.class;
    }

    protected String getModelClassName() {
        return Geplante_arbeit.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = geplante_arbeitPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
