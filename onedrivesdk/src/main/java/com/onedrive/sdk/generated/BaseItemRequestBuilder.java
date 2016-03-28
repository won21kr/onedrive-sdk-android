// ------------------------------------------------------------------------------
// Copyright (c) 2015 Microsoft Corporation
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
// ------------------------------------------------------------------------------

package com.onedrive.sdk.generated;

import com.onedrive.sdk.concurrency.*;
import com.onedrive.sdk.core.*;
import com.onedrive.sdk.extensions.*;
import com.onedrive.sdk.http.*;
import com.onedrive.sdk.generated.*;
import com.onedrive.sdk.options.*;
import com.onedrive.sdk.serializer.*;

import java.util.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Item Request Builder.
 */
public class BaseItemRequestBuilder extends BaseRequestBuilder implements IBaseItemRequestBuilder {

    /**
     * The request builder for the Item
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseItemRequestBuilder(final String requestUrl, final IOneDriveClient client, final List<Option> options) {
        super(requestUrl, client, options);
    }

    /**
     * Creates the request
     */
    public IItemRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
     */
    public IItemRequest buildRequest(final List<Option> options) {
        return new ItemRequest(getRequestUrl(), getClient(), options);
    }

    public IPermissionCollectionRequestBuilder getPermissions() {
        return new PermissionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("permissions"), getClient(), null);
    }

    public IPermissionRequestBuilder getPermissions(final String id) {
        return new PermissionRequestBuilder(getRequestUrlWithAdditionalSegment("permissions") + "/" + id, getClient(), null);
    }

    public IItemCollectionRequestBuilder getChildren() {
        return new ItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("children"), getClient(), null);
    }

    public IItemRequestBuilder getChildren(final String id) {
        return new ItemRequestBuilder(getRequestUrlWithAdditionalSegment("children") + "/" + id, getClient(), null);
    }

    public IThumbnailSetCollectionRequestBuilder getThumbnails() {
        return new ThumbnailSetCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("thumbnails"), getClient(), null);
    }

    public IThumbnailSetRequestBuilder getThumbnails(final String id) {
        return new ThumbnailSetRequestBuilder(getRequestUrlWithAdditionalSegment("thumbnails") + "/" + id, getClient(), null);
    }

    public IItemStreamRequestBuilder getContent() {
        return new ItemStreamRequestBuilder(getRequestUrlWithAdditionalSegment("content"), getClient(), null);
    }

    public ICreateSessionRequestBuilder getCreateSession(final ChunkedUploadSessionDescriptor item) {
        return new CreateSessionRequestBuilder(getRequestUrlWithAdditionalSegment("upload.createSession"), getClient(), null, item);
    }

    public ICopyRequestBuilder getCopy(final String name, final ItemReference parentReference) {
        return new CopyRequestBuilder(getRequestUrlWithAdditionalSegment("action.copy"), getClient(), null, name, parentReference);
    }

    public ICreateLinkRequestBuilder getCreateLink(final String type) {
        return new CreateLinkRequestBuilder(getRequestUrlWithAdditionalSegment("action.createLink"), getClient(), null, type);
    }

    public IDeltaRequestBuilder getDelta(final String token) {
        return new DeltaRequestBuilder(getRequestUrlWithAdditionalSegment("view.delta"), getClient(), null, token);
    }

    public ISearchRequestBuilder getSearch(final String q) {
        return new SearchRequestBuilder(getRequestUrlWithAdditionalSegment("view.search"), getClient(), null, q);
    }
}
