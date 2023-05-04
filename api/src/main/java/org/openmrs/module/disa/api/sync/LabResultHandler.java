package org.openmrs.module.disa.api.sync;

import org.openmrs.module.disa.LabResult;
import org.openmrs.module.disa.LabResultStatus;

/**
 * Represents a link in the chain of responsibility for handling lab results.
 */
public interface LabResultHandler {

    public LabResultStatus handle(LabResult labResult);

    public void setNext(LabResultHandler handler);
}
