package de.hska.wi.awp.datasource.infosys.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import de.hska.wi.awp.datasource.infosys.model.BewertungskriteriumClp;
import de.hska.wi.awp.datasource.infosys.model.FeedbackClp;
import de.hska.wi.awp.datasource.infosys.model.ProjectClp;
import de.hska.wi.awp.datasource.infosys.model.RolleClp;
import de.hska.wi.awp.datasource.infosys.model.Statusbericht_detailClp;
import de.hska.wi.awp.datasource.infosys.model.Statusbericht_detail_punktClp;
import de.hska.wi.awp.datasource.infosys.model.Statusbericht_geplante_arbeitClp;
import de.hska.wi.awp.datasource.infosys.model.Statusbericht_infoClp;
import de.hska.wi.awp.datasource.infosys.model.Statusbericht_info_punktClp;
import de.hska.wi.awp.datasource.infosys.model.StatusberichteClp;
import de.hska.wi.awp.datasource.infosys.model.StudentClp;
import de.hska.wi.awp.datasource.infosys.model.Teilnote_feedbackClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;


public class ClpSerializer {
    private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
    private static String _servletContextName;
    private static boolean _useReflectionToTranslateThrowable = true;

    public static String getServletContextName() {
        if (Validator.isNotNull(_servletContextName)) {
            return _servletContextName;
        }

        synchronized (ClpSerializer.class) {
            if (Validator.isNotNull(_servletContextName)) {
                return _servletContextName;
            }

            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Class<?> portletPropsClass = classLoader.loadClass(
                        "com.liferay.util.portlet.PortletProps");

                Method getMethod = portletPropsClass.getMethod("get",
                        new Class<?>[] { String.class });

                String portletPropsServletContextName = (String) getMethod.invoke(null,
                        "datasourceInfosys-portlet-deployment-context");

                if (Validator.isNotNull(portletPropsServletContextName)) {
                    _servletContextName = portletPropsServletContextName;
                }
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info(
                        "Unable to locate deployment context from portlet properties");
                }
            }

            if (Validator.isNull(_servletContextName)) {
                try {
                    String propsUtilServletContextName = PropsUtil.get(
                            "datasourceInfosys-portlet-deployment-context");

                    if (Validator.isNotNull(propsUtilServletContextName)) {
                        _servletContextName = propsUtilServletContextName;
                    }
                } catch (Throwable t) {
                    if (_log.isInfoEnabled()) {
                        _log.info(
                            "Unable to locate deployment context from portal properties");
                    }
                }
            }

            if (Validator.isNull(_servletContextName)) {
                _servletContextName = "datasourceInfosys-portlet";
            }

            return _servletContextName;
        }
    }

    public static Object translateInput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals(BewertungskriteriumClp.class.getName())) {
            return translateInputBewertungskriterium(oldModel);
        }

        if (oldModelClassName.equals(FeedbackClp.class.getName())) {
            return translateInputFeedback(oldModel);
        }

        if (oldModelClassName.equals(ProjectClp.class.getName())) {
            return translateInputProject(oldModel);
        }

        if (oldModelClassName.equals(RolleClp.class.getName())) {
            return translateInputRolle(oldModel);
        }

        if (oldModelClassName.equals(Statusbericht_detailClp.class.getName())) {
            return translateInputStatusbericht_detail(oldModel);
        }

        if (oldModelClassName.equals(
                    Statusbericht_detail_punktClp.class.getName())) {
            return translateInputStatusbericht_detail_punkt(oldModel);
        }

        if (oldModelClassName.equals(
                    Statusbericht_geplante_arbeitClp.class.getName())) {
            return translateInputStatusbericht_geplante_arbeit(oldModel);
        }

        if (oldModelClassName.equals(Statusbericht_infoClp.class.getName())) {
            return translateInputStatusbericht_info(oldModel);
        }

        if (oldModelClassName.equals(
                    Statusbericht_info_punktClp.class.getName())) {
            return translateInputStatusbericht_info_punkt(oldModel);
        }

        if (oldModelClassName.equals(StatusberichteClp.class.getName())) {
            return translateInputStatusberichte(oldModel);
        }

        if (oldModelClassName.equals(StudentClp.class.getName())) {
            return translateInputStudent(oldModel);
        }

        if (oldModelClassName.equals(Teilnote_feedbackClp.class.getName())) {
            return translateInputTeilnote_feedback(oldModel);
        }

        return oldModel;
    }

    public static Object translateInput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateInput(curObj));
        }

        return newList;
    }

    public static Object translateInputBewertungskriterium(
        BaseModel<?> oldModel) {
        BewertungskriteriumClp oldClpModel = (BewertungskriteriumClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getBewertungskriteriumRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputFeedback(BaseModel<?> oldModel) {
        FeedbackClp oldClpModel = (FeedbackClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getFeedbackRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputProject(BaseModel<?> oldModel) {
        ProjectClp oldClpModel = (ProjectClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getProjectRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputRolle(BaseModel<?> oldModel) {
        RolleClp oldClpModel = (RolleClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getRolleRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputStatusbericht_detail(
        BaseModel<?> oldModel) {
        Statusbericht_detailClp oldClpModel = (Statusbericht_detailClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getStatusbericht_detailRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputStatusbericht_detail_punkt(
        BaseModel<?> oldModel) {
        Statusbericht_detail_punktClp oldClpModel = (Statusbericht_detail_punktClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getStatusbericht_detail_punktRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputStatusbericht_geplante_arbeit(
        BaseModel<?> oldModel) {
        Statusbericht_geplante_arbeitClp oldClpModel = (Statusbericht_geplante_arbeitClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getStatusbericht_geplante_arbeitRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputStatusbericht_info(BaseModel<?> oldModel) {
        Statusbericht_infoClp oldClpModel = (Statusbericht_infoClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getStatusbericht_infoRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputStatusbericht_info_punkt(
        BaseModel<?> oldModel) {
        Statusbericht_info_punktClp oldClpModel = (Statusbericht_info_punktClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getStatusbericht_info_punktRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputStatusberichte(BaseModel<?> oldModel) {
        StatusberichteClp oldClpModel = (StatusberichteClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getStatusberichteRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputStudent(BaseModel<?> oldModel) {
        StudentClp oldClpModel = (StudentClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getStudentRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputTeilnote_feedback(BaseModel<?> oldModel) {
        Teilnote_feedbackClp oldClpModel = (Teilnote_feedbackClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getTeilnote_feedbackRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateInput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateInput((List<Object>) obj);
        } else {
            return obj;
        }
    }

    public static Object translateOutput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals(
                    "de.hska.wi.awp.datasource.infosys.model.impl.BewertungskriteriumImpl")) {
            return translateOutputBewertungskriterium(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "de.hska.wi.awp.datasource.infosys.model.impl.FeedbackImpl")) {
            return translateOutputFeedback(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "de.hska.wi.awp.datasource.infosys.model.impl.ProjectImpl")) {
            return translateOutputProject(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "de.hska.wi.awp.datasource.infosys.model.impl.RolleImpl")) {
            return translateOutputRolle(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_detailImpl")) {
            return translateOutputStatusbericht_detail(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_detail_punktImpl")) {
            return translateOutputStatusbericht_detail_punkt(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_geplante_arbeitImpl")) {
            return translateOutputStatusbericht_geplante_arbeit(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_infoImpl")) {
            return translateOutputStatusbericht_info(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "de.hska.wi.awp.datasource.infosys.model.impl.Statusbericht_info_punktImpl")) {
            return translateOutputStatusbericht_info_punkt(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "de.hska.wi.awp.datasource.infosys.model.impl.StatusberichteImpl")) {
            return translateOutputStatusberichte(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "de.hska.wi.awp.datasource.infosys.model.impl.StudentImpl")) {
            return translateOutputStudent(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "de.hska.wi.awp.datasource.infosys.model.impl.Teilnote_feedbackImpl")) {
            return translateOutputTeilnote_feedback(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        return oldModel;
    }

    public static Object translateOutput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateOutput(curObj));
        }

        return newList;
    }

    public static Object translateOutput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateOutput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateOutput((List<Object>) obj);
        } else {
            return obj;
        }
    }

    public static Throwable translateThrowable(Throwable throwable) {
        if (_useReflectionToTranslateThrowable) {
            try {
                UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

                objectOutputStream.writeObject(throwable);

                objectOutputStream.flush();
                objectOutputStream.close();

                UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
                        0, unsyncByteArrayOutputStream.size());

                Thread currentThread = Thread.currentThread();

                ClassLoader contextClassLoader = currentThread.getContextClassLoader();

                ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
                        contextClassLoader);

                throwable = (Throwable) objectInputStream.readObject();

                objectInputStream.close();

                return throwable;
            } catch (SecurityException se) {
                if (_log.isInfoEnabled()) {
                    _log.info("Do not use reflection to translate throwable");
                }

                _useReflectionToTranslateThrowable = false;
            } catch (Throwable throwable2) {
                _log.error(throwable2, throwable2);

                return throwable2;
            }
        }

        Class<?> clazz = throwable.getClass();

        String className = clazz.getName();

        if (className.equals(PortalException.class.getName())) {
            return new PortalException();
        }

        if (className.equals(SystemException.class.getName())) {
            return new SystemException();
        }

        if (className.equals(
                    "de.hska.wi.awp.datasource.infosys.NoSuchBewertungskriteriumException")) {
            return new de.hska.wi.awp.datasource.infosys.NoSuchBewertungskriteriumException();
        }

        if (className.equals(
                    "de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException")) {
            return new de.hska.wi.awp.datasource.infosys.NoSuchFeedbackException();
        }

        if (className.equals(
                    "de.hska.wi.awp.datasource.infosys.NoSuchProjectException")) {
            return new de.hska.wi.awp.datasource.infosys.NoSuchProjectException();
        }

        if (className.equals(
                    "de.hska.wi.awp.datasource.infosys.NoSuchRolleException")) {
            return new de.hska.wi.awp.datasource.infosys.NoSuchRolleException();
        }

        if (className.equals(
                    "de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_detailException")) {
            return new de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_detailException();
        }

        if (className.equals(
                    "de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_detail_punktException")) {
            return new de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_detail_punktException();
        }

        if (className.equals(
                    "de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_geplante_arbeitException")) {
            return new de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_geplante_arbeitException();
        }

        if (className.equals(
                    "de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_infoException")) {
            return new de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_infoException();
        }

        if (className.equals(
                    "de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_info_punktException")) {
            return new de.hska.wi.awp.datasource.infosys.NoSuchStatusbericht_info_punktException();
        }

        if (className.equals(
                    "de.hska.wi.awp.datasource.infosys.NoSuchStatusberichteException")) {
            return new de.hska.wi.awp.datasource.infosys.NoSuchStatusberichteException();
        }

        if (className.equals(
                    "de.hska.wi.awp.datasource.infosys.NoSuchStudentException")) {
            return new de.hska.wi.awp.datasource.infosys.NoSuchStudentException();
        }

        if (className.equals(
                    "de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException")) {
            return new de.hska.wi.awp.datasource.infosys.NoSuchTeilnote_feedbackException();
        }

        return throwable;
    }

    public static Object translateOutputBewertungskriterium(
        BaseModel<?> oldModel) {
        BewertungskriteriumClp newModel = new BewertungskriteriumClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setBewertungskriteriumRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputFeedback(BaseModel<?> oldModel) {
        FeedbackClp newModel = new FeedbackClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setFeedbackRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputProject(BaseModel<?> oldModel) {
        ProjectClp newModel = new ProjectClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setProjectRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputRolle(BaseModel<?> oldModel) {
        RolleClp newModel = new RolleClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setRolleRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputStatusbericht_detail(
        BaseModel<?> oldModel) {
        Statusbericht_detailClp newModel = new Statusbericht_detailClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setStatusbericht_detailRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputStatusbericht_detail_punkt(
        BaseModel<?> oldModel) {
        Statusbericht_detail_punktClp newModel = new Statusbericht_detail_punktClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setStatusbericht_detail_punktRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputStatusbericht_geplante_arbeit(
        BaseModel<?> oldModel) {
        Statusbericht_geplante_arbeitClp newModel = new Statusbericht_geplante_arbeitClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setStatusbericht_geplante_arbeitRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputStatusbericht_info(
        BaseModel<?> oldModel) {
        Statusbericht_infoClp newModel = new Statusbericht_infoClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setStatusbericht_infoRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputStatusbericht_info_punkt(
        BaseModel<?> oldModel) {
        Statusbericht_info_punktClp newModel = new Statusbericht_info_punktClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setStatusbericht_info_punktRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputStatusberichte(BaseModel<?> oldModel) {
        StatusberichteClp newModel = new StatusberichteClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setStatusberichteRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputStudent(BaseModel<?> oldModel) {
        StudentClp newModel = new StudentClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setStudentRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputTeilnote_feedback(BaseModel<?> oldModel) {
        Teilnote_feedbackClp newModel = new Teilnote_feedbackClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setTeilnote_feedbackRemoteModel(oldModel);

        return newModel;
    }
}
