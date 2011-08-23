/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticache.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#modifyCacheParameterGroup(ModifyCacheParameterGroupRequest) ModifyCacheParameterGroup operation}.
 * <p>
 * Modifies the parameters of a CacheParameterGroup. To modify more than
 * one parameter, submit a list of ParameterName and ParameterValue
 * parameters. A maximum of 20 parameters can be modified in a single
 * request.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#modifyCacheParameterGroup(ModifyCacheParameterGroupRequest)
 */
public class ModifyCacheParameterGroupRequest extends AmazonWebServiceRequest {

    /**
     * The name of the cache parameter group to modify.
     */
    private String cacheParameterGroupName;

    /**
     * An array of parameter names and values for the parameter update. At
     * least one parameter name and value must be supplied; subsequent
     * arguments are optional. A maximum of 20 parameters may be modified in
     * a single request.
     */
    private java.util.List<ParameterNameValue> parameterNameValues;

    /**
     * Default constructor for a new ModifyCacheParameterGroupRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ModifyCacheParameterGroupRequest() {}
    
    /**
     * Constructs a new ModifyCacheParameterGroupRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param cacheParameterGroupName The name of the cache parameter group
     * to modify.
     * @param parameterNameValues An array of parameter names and values for
     * the parameter update. At least one parameter name and value must be
     * supplied; subsequent arguments are optional. A maximum of 20
     * parameters may be modified in a single request.
     */
    public ModifyCacheParameterGroupRequest(String cacheParameterGroupName, java.util.List<ParameterNameValue> parameterNameValues) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        this.parameterNameValues = parameterNameValues;
    }
    
    /**
     * The name of the cache parameter group to modify.
     *
     * @return The name of the cache parameter group to modify.
     */
    public String getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }
    
    /**
     * The name of the cache parameter group to modify.
     *
     * @param cacheParameterGroupName The name of the cache parameter group to modify.
     */
    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }
    
    /**
     * The name of the cache parameter group to modify.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroupName The name of the cache parameter group to modify.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyCacheParameterGroupRequest withCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        return this;
    }
    
    
    /**
     * An array of parameter names and values for the parameter update. At
     * least one parameter name and value must be supplied; subsequent
     * arguments are optional. A maximum of 20 parameters may be modified in
     * a single request.
     *
     * @return An array of parameter names and values for the parameter update. At
     *         least one parameter name and value must be supplied; subsequent
     *         arguments are optional. A maximum of 20 parameters may be modified in
     *         a single request.
     */
    public java.util.List<ParameterNameValue> getParameterNameValues() {
        
        if (parameterNameValues == null) {
            parameterNameValues = new java.util.ArrayList<ParameterNameValue>();
        }
        return parameterNameValues;
    }
    
    /**
     * An array of parameter names and values for the parameter update. At
     * least one parameter name and value must be supplied; subsequent
     * arguments are optional. A maximum of 20 parameters may be modified in
     * a single request.
     *
     * @param parameterNameValues An array of parameter names and values for the parameter update. At
     *         least one parameter name and value must be supplied; subsequent
     *         arguments are optional. A maximum of 20 parameters may be modified in
     *         a single request.
     */
    public void setParameterNameValues(java.util.Collection<ParameterNameValue> parameterNameValues) {
        java.util.List<ParameterNameValue> parameterNameValuesCopy = new java.util.ArrayList<ParameterNameValue>();
        if (parameterNameValues != null) {
            parameterNameValuesCopy.addAll(parameterNameValues);
        }
        this.parameterNameValues = parameterNameValuesCopy;
    }
    
    /**
     * An array of parameter names and values for the parameter update. At
     * least one parameter name and value must be supplied; subsequent
     * arguments are optional. A maximum of 20 parameters may be modified in
     * a single request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterNameValues An array of parameter names and values for the parameter update. At
     *         least one parameter name and value must be supplied; subsequent
     *         arguments are optional. A maximum of 20 parameters may be modified in
     *         a single request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyCacheParameterGroupRequest withParameterNameValues(ParameterNameValue... parameterNameValues) {
        if (getParameterNameValues() == null) setParameterNameValues(new java.util.ArrayList<ParameterNameValue>());
        for (ParameterNameValue value : parameterNameValues) {
            getParameterNameValues().add(value);
        }
        return this;
    }
    
    /**
     * An array of parameter names and values for the parameter update. At
     * least one parameter name and value must be supplied; subsequent
     * arguments are optional. A maximum of 20 parameters may be modified in
     * a single request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterNameValues An array of parameter names and values for the parameter update. At
     *         least one parameter name and value must be supplied; subsequent
     *         arguments are optional. A maximum of 20 parameters may be modified in
     *         a single request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyCacheParameterGroupRequest withParameterNameValues(java.util.Collection<ParameterNameValue> parameterNameValues) {
        java.util.List<ParameterNameValue> parameterNameValuesCopy = new java.util.ArrayList<ParameterNameValue>();
        if (parameterNameValues != null) {
            parameterNameValuesCopy.addAll(parameterNameValues);
        }
        this.parameterNameValues = parameterNameValuesCopy;

        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("CacheParameterGroupName: " + cacheParameterGroupName + ", ");
        sb.append("ParameterNameValues: " + parameterNameValues + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    