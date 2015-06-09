package de.hska.wi.awp.datasource.infosys.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import de.hska.wi.awp.datasource.infosys.model.Statusberichte;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Statusberichte in entity cache.
 *
 * @author Daniel Storch
 * @see Statusberichte
 * @generated
 */
public class StatusberichteCacheModel implements CacheModel<Statusberichte>,
    Externalizable {
    public long id;
    public long project_id;
    public long datum;
    public int kalenderwoche;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{id=");
        sb.append(id);
        sb.append(", project_id=");
        sb.append(project_id);
        sb.append(", datum=");
        sb.append(datum);
        sb.append(", kalenderwoche=");
        sb.append(kalenderwoche);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Statusberichte toEntityModel() {
        StatusberichteImpl statusberichteImpl = new StatusberichteImpl();

        statusberichteImpl.setId(id);
        statusberichteImpl.setProject_id(project_id);

        if (datum == Long.MIN_VALUE) {
            statusberichteImpl.setDatum(null);
        } else {
            statusberichteImpl.setDatum(new Date(datum));
        }

        statusberichteImpl.setKalenderwoche(kalenderwoche);

        statusberichteImpl.resetOriginalValues();

        return statusberichteImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        project_id = objectInput.readLong();
        datum = objectInput.readLong();
        kalenderwoche = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);
        objectOutput.writeLong(project_id);
        objectOutput.writeLong(datum);
        objectOutput.writeInt(kalenderwoche);
    }
}
