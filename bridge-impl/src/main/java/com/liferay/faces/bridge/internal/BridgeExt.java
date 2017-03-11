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
package com.liferay.faces.bridge.internal;

/**
 * @author  Neil Griffin
 */
public interface BridgeExt {

	/** The name of the {@link javax.portlet.PortletRequest} attribute that contains the BridgeContext instance. */
	@Deprecated
	public static final String BRIDGE_CONTEXT_ATTRIBUTE = "javax.portlet.faces.bridgeContext";

	public static final String BOOKMARKABLE_PARAMETER = "_jsfBridgeBookmarkable";
	public static final String FACES_AJAX_PARAMETER = "_jsfBridgeAjax";
	public static final String REDIRECT_PARAMETER = "_jsfBridgeRedirect";
	public static final String RENDER_REDIRECT = "com.liferay.faces.bridge.renderRedirect";
	public static final String RENDER_REDIRECT_AFTER_DISPATCH = "com.liferay.faces.bridge.renderRedirectAfterDispatch";
	public static final String RENDER_REDIRECT_VIEW_ID = "com.liferay.faces.bridge.renderRedirectViewId";
	public static final String RESPONSE_CHARACTER_ENCODING = "com.liferay.faces.bridge.responseCharacterEncoding";
	public static final String WRITER_OPERATIONS = "com.liferay.faces.bridge.writerOperations";
}
