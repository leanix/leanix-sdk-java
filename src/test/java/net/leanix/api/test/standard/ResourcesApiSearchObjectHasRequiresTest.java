/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 LeanIX GmbH
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package net.leanix.api.test.standard;

import static org.junit.Assert.*;

import java.util.List;

import net.leanix.api.common.*;
import net.leanix.api.models.Resource;
import net.leanix.api.models.Iface;
import net.leanix.api.models.IfaceHasResource;
import net.leanix.api.*;
import net.leanix.api.models.FactSheetHasRequires;
import net.leanix.api.models.Provider;
import net.leanix.api.test.*;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResourcesApiSearchObjectHasRequiresTest extends TestBase {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    final Logger logger = LoggerFactory.getLogger(ResourcesApiSearchObjectHasRequiresTest.class);

    protected ResourcesApi getApi() throws Exception {
        ResourcesApi api = getResourcesApi();
        return api;
    }

    protected ProvidersApi getApiRelated() throws Exception {
        ProvidersApi api = getProvidersApi();

        return api;
    }

    protected Resource newModel() {
        return new Resource();
    }

    protected Provider newModelRelated() {
        return new Provider();
    }

    protected void setAttributes(FactSheetHasRequires model) {
        // Attributes
    }

    protected void changeAttributes(FactSheetHasRequires model) {
        // Attributes
    }

    protected void assertEqual(FactSheetHasRequires a, FactSheetHasRequires b) {
        assertEquals(a.getID(), b.getID());
        assertEquals(a.getFactSheetID(), b.getFactSheetID());
        assertEquals(a.getFactSheetRefID(), b.getFactSheetRefID());

        // Further attributes
    }

    protected Resource createNewModel(String namePart) throws ApiException, Exception {
        Resource model = this.newModel();
        model.setName("Resource FactSheetHasRequires" + namePart);

        Resource newModel = this.getApi().createResource(model);
        return newModel;
    }

    protected Provider createNewModelRelated(String namePart) throws ApiException, Exception {
        Provider model = this.newModelRelated();
        model.setName("Iface IfaceHasResource" + namePart);

        Provider newModel = this.getApiRelated().createProvider(model);
        return newModel;
    }

    protected FactSheetHasRequires newRelationModel(Resource model, Provider refModel) {
        FactSheetHasRequires relationModel = new FactSheetHasRequires();
        relationModel.setFactSheetID(model.getID());
        relationModel.setFactSheetRefID(refModel.getID());

        this.setAttributes(relationModel);

        return relationModel;
    }

    protected FactSheetHasRequires createNewRelationModel(String namePart) throws ApiException, Exception {
        Resource model = this.createNewModel(namePart + "A");
        Provider modelRelated = this.createNewModelRelated(namePart + "B");

        FactSheetHasRequires relationModel = this.newRelationModel(model, modelRelated);

        FactSheetHasRequires newRelationModel = this.getApi().createFactSheetHasRequires(model.getID(), relationModel);

        return newRelationModel;
    }

    @Test
    public void testCreateAndGet() throws Exception {
        FactSheetHasRequires newRelationModel = this.createNewRelationModel("CreateAndGet");

        assertNotNull(newRelationModel);
        assertNotNull(newRelationModel.getID());

        FactSheetHasRequires newGetModel = this.getApi().getFactSheetHasRequires(newRelationModel.getFactSheetID(), newRelationModel.getID());
        assertNotNull(newGetModel);
        assertNotNull(newGetModel.getID());

        assertEqual(newRelationModel, newGetModel);
    }
}
