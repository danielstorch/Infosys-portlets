package de.hska.wi.awp.datasource.infosys.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import de.hska.wi.awp.datasource.infosys.model.Project;
import de.hska.wi.awp.datasource.infosys.service.ProjectService;
import de.hska.wi.awp.datasource.infosys.service.persistence.BewertungskriteriumPersistence;
import de.hska.wi.awp.datasource.infosys.service.persistence.FeedbackPersistence;
import de.hska.wi.awp.datasource.infosys.service.persistence.ProjectPersistence;
import de.hska.wi.awp.datasource.infosys.service.persistence.RollePersistence;
import de.hska.wi.awp.datasource.infosys.service.persistence.Statusbericht_detailPersistence;
import de.hska.wi.awp.datasource.infosys.service.persistence.Statusbericht_detail_punktPersistence;
import de.hska.wi.awp.datasource.infosys.service.persistence.Statusbericht_geplante_arbeitPersistence;
import de.hska.wi.awp.datasource.infosys.service.persistence.Statusbericht_infoPersistence;
import de.hska.wi.awp.datasource.infosys.service.persistence.Statusbericht_info_punktPersistence;
import de.hska.wi.awp.datasource.infosys.service.persistence.StatusberichtePersistence;
import de.hska.wi.awp.datasource.infosys.service.persistence.StudentPersistence;
import de.hska.wi.awp.datasource.infosys.service.persistence.Teilnote_feedbackPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the project remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link de.hska.wi.awp.datasource.infosys.service.impl.ProjectServiceImpl}.
 * </p>
 *
 * @author Daniel Storch
 * @see de.hska.wi.awp.datasource.infosys.service.impl.ProjectServiceImpl
 * @see de.hska.wi.awp.datasource.infosys.service.ProjectServiceUtil
 * @generated
 */
public abstract class ProjectServiceBaseImpl extends BaseServiceImpl
    implements ProjectService, IdentifiableBean {
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
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.Statusbericht_detailLocalService.class)
    protected de.hska.wi.awp.datasource.infosys.service.Statusbericht_detailLocalService statusbericht_detailLocalService;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.Statusbericht_detailService.class)
    protected de.hska.wi.awp.datasource.infosys.service.Statusbericht_detailService statusbericht_detailService;
    @BeanReference(type = Statusbericht_detailPersistence.class)
    protected Statusbericht_detailPersistence statusbericht_detailPersistence;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.Statusbericht_detail_punktLocalService.class)
    protected de.hska.wi.awp.datasource.infosys.service.Statusbericht_detail_punktLocalService statusbericht_detail_punktLocalService;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.Statusbericht_detail_punktService.class)
    protected de.hska.wi.awp.datasource.infosys.service.Statusbericht_detail_punktService statusbericht_detail_punktService;
    @BeanReference(type = Statusbericht_detail_punktPersistence.class)
    protected Statusbericht_detail_punktPersistence statusbericht_detail_punktPersistence;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.Statusbericht_geplante_arbeitLocalService.class)
    protected de.hska.wi.awp.datasource.infosys.service.Statusbericht_geplante_arbeitLocalService statusbericht_geplante_arbeitLocalService;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.Statusbericht_geplante_arbeitService.class)
    protected de.hska.wi.awp.datasource.infosys.service.Statusbericht_geplante_arbeitService statusbericht_geplante_arbeitService;
    @BeanReference(type = Statusbericht_geplante_arbeitPersistence.class)
    protected Statusbericht_geplante_arbeitPersistence statusbericht_geplante_arbeitPersistence;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.Statusbericht_infoLocalService.class)
    protected de.hska.wi.awp.datasource.infosys.service.Statusbericht_infoLocalService statusbericht_infoLocalService;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.Statusbericht_infoService.class)
    protected de.hska.wi.awp.datasource.infosys.service.Statusbericht_infoService statusbericht_infoService;
    @BeanReference(type = Statusbericht_infoPersistence.class)
    protected Statusbericht_infoPersistence statusbericht_infoPersistence;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.Statusbericht_info_punktLocalService.class)
    protected de.hska.wi.awp.datasource.infosys.service.Statusbericht_info_punktLocalService statusbericht_info_punktLocalService;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.Statusbericht_info_punktService.class)
    protected de.hska.wi.awp.datasource.infosys.service.Statusbericht_info_punktService statusbericht_info_punktService;
    @BeanReference(type = Statusbericht_info_punktPersistence.class)
    protected Statusbericht_info_punktPersistence statusbericht_info_punktPersistence;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.StatusberichteLocalService.class)
    protected de.hska.wi.awp.datasource.infosys.service.StatusberichteLocalService statusberichteLocalService;
    @BeanReference(type = de.hska.wi.awp.datasource.infosys.service.StatusberichteService.class)
    protected de.hska.wi.awp.datasource.infosys.service.StatusberichteService statusberichteService;
    @BeanReference(type = StatusberichtePersistence.class)
    protected StatusberichtePersistence statusberichtePersistence;
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
    private ProjectServiceClpInvoker _clpInvoker = new ProjectServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link de.hska.wi.awp.datasource.infosys.service.ProjectServiceUtil} to access the project remote service.
     */

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
     * Returns the statusbericht_detail local service.
     *
     * @return the statusbericht_detail local service
     */
    public de.hska.wi.awp.datasource.infosys.service.Statusbericht_detailLocalService getStatusbericht_detailLocalService() {
        return statusbericht_detailLocalService;
    }

    /**
     * Sets the statusbericht_detail local service.
     *
     * @param statusbericht_detailLocalService the statusbericht_detail local service
     */
    public void setStatusbericht_detailLocalService(
        de.hska.wi.awp.datasource.infosys.service.Statusbericht_detailLocalService statusbericht_detailLocalService) {
        this.statusbericht_detailLocalService = statusbericht_detailLocalService;
    }

    /**
     * Returns the statusbericht_detail remote service.
     *
     * @return the statusbericht_detail remote service
     */
    public de.hska.wi.awp.datasource.infosys.service.Statusbericht_detailService getStatusbericht_detailService() {
        return statusbericht_detailService;
    }

    /**
     * Sets the statusbericht_detail remote service.
     *
     * @param statusbericht_detailService the statusbericht_detail remote service
     */
    public void setStatusbericht_detailService(
        de.hska.wi.awp.datasource.infosys.service.Statusbericht_detailService statusbericht_detailService) {
        this.statusbericht_detailService = statusbericht_detailService;
    }

    /**
     * Returns the statusbericht_detail persistence.
     *
     * @return the statusbericht_detail persistence
     */
    public Statusbericht_detailPersistence getStatusbericht_detailPersistence() {
        return statusbericht_detailPersistence;
    }

    /**
     * Sets the statusbericht_detail persistence.
     *
     * @param statusbericht_detailPersistence the statusbericht_detail persistence
     */
    public void setStatusbericht_detailPersistence(
        Statusbericht_detailPersistence statusbericht_detailPersistence) {
        this.statusbericht_detailPersistence = statusbericht_detailPersistence;
    }

    /**
     * Returns the statusbericht_detail_punkt local service.
     *
     * @return the statusbericht_detail_punkt local service
     */
    public de.hska.wi.awp.datasource.infosys.service.Statusbericht_detail_punktLocalService getStatusbericht_detail_punktLocalService() {
        return statusbericht_detail_punktLocalService;
    }

    /**
     * Sets the statusbericht_detail_punkt local service.
     *
     * @param statusbericht_detail_punktLocalService the statusbericht_detail_punkt local service
     */
    public void setStatusbericht_detail_punktLocalService(
        de.hska.wi.awp.datasource.infosys.service.Statusbericht_detail_punktLocalService statusbericht_detail_punktLocalService) {
        this.statusbericht_detail_punktLocalService = statusbericht_detail_punktLocalService;
    }

    /**
     * Returns the statusbericht_detail_punkt remote service.
     *
     * @return the statusbericht_detail_punkt remote service
     */
    public de.hska.wi.awp.datasource.infosys.service.Statusbericht_detail_punktService getStatusbericht_detail_punktService() {
        return statusbericht_detail_punktService;
    }

    /**
     * Sets the statusbericht_detail_punkt remote service.
     *
     * @param statusbericht_detail_punktService the statusbericht_detail_punkt remote service
     */
    public void setStatusbericht_detail_punktService(
        de.hska.wi.awp.datasource.infosys.service.Statusbericht_detail_punktService statusbericht_detail_punktService) {
        this.statusbericht_detail_punktService = statusbericht_detail_punktService;
    }

    /**
     * Returns the statusbericht_detail_punkt persistence.
     *
     * @return the statusbericht_detail_punkt persistence
     */
    public Statusbericht_detail_punktPersistence getStatusbericht_detail_punktPersistence() {
        return statusbericht_detail_punktPersistence;
    }

    /**
     * Sets the statusbericht_detail_punkt persistence.
     *
     * @param statusbericht_detail_punktPersistence the statusbericht_detail_punkt persistence
     */
    public void setStatusbericht_detail_punktPersistence(
        Statusbericht_detail_punktPersistence statusbericht_detail_punktPersistence) {
        this.statusbericht_detail_punktPersistence = statusbericht_detail_punktPersistence;
    }

    /**
     * Returns the statusbericht_geplante_arbeit local service.
     *
     * @return the statusbericht_geplante_arbeit local service
     */
    public de.hska.wi.awp.datasource.infosys.service.Statusbericht_geplante_arbeitLocalService getStatusbericht_geplante_arbeitLocalService() {
        return statusbericht_geplante_arbeitLocalService;
    }

    /**
     * Sets the statusbericht_geplante_arbeit local service.
     *
     * @param statusbericht_geplante_arbeitLocalService the statusbericht_geplante_arbeit local service
     */
    public void setStatusbericht_geplante_arbeitLocalService(
        de.hska.wi.awp.datasource.infosys.service.Statusbericht_geplante_arbeitLocalService statusbericht_geplante_arbeitLocalService) {
        this.statusbericht_geplante_arbeitLocalService = statusbericht_geplante_arbeitLocalService;
    }

    /**
     * Returns the statusbericht_geplante_arbeit remote service.
     *
     * @return the statusbericht_geplante_arbeit remote service
     */
    public de.hska.wi.awp.datasource.infosys.service.Statusbericht_geplante_arbeitService getStatusbericht_geplante_arbeitService() {
        return statusbericht_geplante_arbeitService;
    }

    /**
     * Sets the statusbericht_geplante_arbeit remote service.
     *
     * @param statusbericht_geplante_arbeitService the statusbericht_geplante_arbeit remote service
     */
    public void setStatusbericht_geplante_arbeitService(
        de.hska.wi.awp.datasource.infosys.service.Statusbericht_geplante_arbeitService statusbericht_geplante_arbeitService) {
        this.statusbericht_geplante_arbeitService = statusbericht_geplante_arbeitService;
    }

    /**
     * Returns the statusbericht_geplante_arbeit persistence.
     *
     * @return the statusbericht_geplante_arbeit persistence
     */
    public Statusbericht_geplante_arbeitPersistence getStatusbericht_geplante_arbeitPersistence() {
        return statusbericht_geplante_arbeitPersistence;
    }

    /**
     * Sets the statusbericht_geplante_arbeit persistence.
     *
     * @param statusbericht_geplante_arbeitPersistence the statusbericht_geplante_arbeit persistence
     */
    public void setStatusbericht_geplante_arbeitPersistence(
        Statusbericht_geplante_arbeitPersistence statusbericht_geplante_arbeitPersistence) {
        this.statusbericht_geplante_arbeitPersistence = statusbericht_geplante_arbeitPersistence;
    }

    /**
     * Returns the statusbericht_info local service.
     *
     * @return the statusbericht_info local service
     */
    public de.hska.wi.awp.datasource.infosys.service.Statusbericht_infoLocalService getStatusbericht_infoLocalService() {
        return statusbericht_infoLocalService;
    }

    /**
     * Sets the statusbericht_info local service.
     *
     * @param statusbericht_infoLocalService the statusbericht_info local service
     */
    public void setStatusbericht_infoLocalService(
        de.hska.wi.awp.datasource.infosys.service.Statusbericht_infoLocalService statusbericht_infoLocalService) {
        this.statusbericht_infoLocalService = statusbericht_infoLocalService;
    }

    /**
     * Returns the statusbericht_info remote service.
     *
     * @return the statusbericht_info remote service
     */
    public de.hska.wi.awp.datasource.infosys.service.Statusbericht_infoService getStatusbericht_infoService() {
        return statusbericht_infoService;
    }

    /**
     * Sets the statusbericht_info remote service.
     *
     * @param statusbericht_infoService the statusbericht_info remote service
     */
    public void setStatusbericht_infoService(
        de.hska.wi.awp.datasource.infosys.service.Statusbericht_infoService statusbericht_infoService) {
        this.statusbericht_infoService = statusbericht_infoService;
    }

    /**
     * Returns the statusbericht_info persistence.
     *
     * @return the statusbericht_info persistence
     */
    public Statusbericht_infoPersistence getStatusbericht_infoPersistence() {
        return statusbericht_infoPersistence;
    }

    /**
     * Sets the statusbericht_info persistence.
     *
     * @param statusbericht_infoPersistence the statusbericht_info persistence
     */
    public void setStatusbericht_infoPersistence(
        Statusbericht_infoPersistence statusbericht_infoPersistence) {
        this.statusbericht_infoPersistence = statusbericht_infoPersistence;
    }

    /**
     * Returns the statusbericht_info_punkt local service.
     *
     * @return the statusbericht_info_punkt local service
     */
    public de.hska.wi.awp.datasource.infosys.service.Statusbericht_info_punktLocalService getStatusbericht_info_punktLocalService() {
        return statusbericht_info_punktLocalService;
    }

    /**
     * Sets the statusbericht_info_punkt local service.
     *
     * @param statusbericht_info_punktLocalService the statusbericht_info_punkt local service
     */
    public void setStatusbericht_info_punktLocalService(
        de.hska.wi.awp.datasource.infosys.service.Statusbericht_info_punktLocalService statusbericht_info_punktLocalService) {
        this.statusbericht_info_punktLocalService = statusbericht_info_punktLocalService;
    }

    /**
     * Returns the statusbericht_info_punkt remote service.
     *
     * @return the statusbericht_info_punkt remote service
     */
    public de.hska.wi.awp.datasource.infosys.service.Statusbericht_info_punktService getStatusbericht_info_punktService() {
        return statusbericht_info_punktService;
    }

    /**
     * Sets the statusbericht_info_punkt remote service.
     *
     * @param statusbericht_info_punktService the statusbericht_info_punkt remote service
     */
    public void setStatusbericht_info_punktService(
        de.hska.wi.awp.datasource.infosys.service.Statusbericht_info_punktService statusbericht_info_punktService) {
        this.statusbericht_info_punktService = statusbericht_info_punktService;
    }

    /**
     * Returns the statusbericht_info_punkt persistence.
     *
     * @return the statusbericht_info_punkt persistence
     */
    public Statusbericht_info_punktPersistence getStatusbericht_info_punktPersistence() {
        return statusbericht_info_punktPersistence;
    }

    /**
     * Sets the statusbericht_info_punkt persistence.
     *
     * @param statusbericht_info_punktPersistence the statusbericht_info_punkt persistence
     */
    public void setStatusbericht_info_punktPersistence(
        Statusbericht_info_punktPersistence statusbericht_info_punktPersistence) {
        this.statusbericht_info_punktPersistence = statusbericht_info_punktPersistence;
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
