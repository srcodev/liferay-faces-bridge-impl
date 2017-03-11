/**
 * Copyright (c) 2000-2017 Liferay, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.liferay.faces.bridge.tck.tests.chapter_3;

import com.liferay.faces.bridge.tck.common.portlet.GenericFacesTestSuitePortlet;


/**
 * This class serves as a compatibility layer in order to minimize diffs across branches for TCK portlets. Its purpose
 * is to determine the conditions under which certain tests need to render a JSF view in the HEADER_PHASE of the portlet
 * lifecycle.
 *
 * @author  Kyle Stiemann
 */
public abstract class BridgeDestroyTestCompatPortlet extends GenericFacesTestSuitePortlet {

	protected static final String DESTROY_ACTION_TEST = "actionDestroyTest";
	protected static final String DESTROY_EVENT_TEST = "eventDestroyTest";
	protected static final String DESTROY_RENDER_TEST = "renderDestroyTest";
	protected static final String DESTROY_RESOURCE_TEST = "resourceDestroyTest";
	protected static final String DESTROY_DOUBLE_TEST = "doubleDestroyTest";
	protected static final String NULLREQUEST_RENDER_TEST = "nullRequestRenderTest";
}
