/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.disa.api.db;

import java.io.Serializable;
import java.util.List;

import org.openmrs.LocationAttribute;
import org.openmrs.module.disa.FsrLog;
import org.openmrs.module.disa.api.DisaService;

/**
 *  Database methods for {@link DisaService}.
 */
public interface DisaDAO {
	
	/*
	 * Add DAO methods here
	 */
	
	public List<LocationAttribute> getAllLocationAttribute(String valueReference);
	
	public Serializable saveFsrLog(FsrLog fsrLog); 
}