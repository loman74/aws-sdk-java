/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2;
            
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.ec2.model.*;

/**
 * Interface for accessing AmazonEC2 asynchronously,
 * using Java Futures.
 * Amazon Elastic Compute Cloud (Amazon EC2) is a web service that
 * provides resizable compute capacity in the cloud. It is designed to
 * make web-scale computing easier for developers. <p>
 * Amazon EC2's simple web service interface allows you to obtain and
 * configure capacity with minimal friction. It provides you with
 * complete control of your computing resources and lets you run on
 * Amazon's proven computing environment. Amazon EC2 reduces the time
 * required to obtain and boot new server instances to minutes, allowing
 * you to quickly scale capacity, both up and down, as your computing
 * requirements change. Amazon EC2 changes the economics of computing by
 * allowing you to pay only for capacity that you actually use. Amazon
 * EC2 provides developers the tools to build failure resilient
 * applications and isolate themselves from common failure scenarios. <p>
 * Visit <a
 * href="http://aws.amazon.com/ec2/">http://aws.amazon.com/ec2/</a> for
 * more information. 
 */       
public interface AmazonEC2Async extends AmazonEC2 {
    /**
     * <p>
     * The RebootInstances operation requests a reboot of one or more
     * instances. This operation is asynchronous; it only queues a request to
     * reboot the specified instance(s). The operation will succeed if the
     * instances are valid and belong to the user. Requests to reboot
     * terminated instances are ignored.
     * </p>
     *
     * @param rebootInstancesRequest Container for the necessary parameters
     *           to execute the RebootInstances operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         RebootInstances service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> rebootInstancesAsync(RebootInstancesRequest rebootInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The RunInstances operation launches a specified number of instances.
     * If Amazon EC2 cannot launch the minimum number AMIs you request, no
     * instances launch. If there is insufficient capacity to launch the
     * maximum number of AMIs you request, Amazon EC2 launches as many as
     * possible to satisfy the requested maximum values. Every instance is
     * launched in a security group. If you do not specify a security group
     * at launch, the instances start in your default security group. For
     * more information on creating security groups, see CreateSecurityGroup.
     * An optional instance type can be specified. For information about
     * instance types, see Instance Types. You can provide an optional key
     * pair ID for each image in the launch request (for more information,
     * see CreateKeyPair). All instances that are created from images that
     * use this key pair will have access to the associated public key at
     * boot. You can use this key to provide secure access to an instance of
     * an image on a per-instance basis. Amazon EC2 public images use this
     * feature to provide secure access without passwords. Important:
     * Launching public images without a key pair ID will leave them
     * inaccessible. The public key material is made available to the
     * instance at boot time by placing it in the openssh_id.pub file on a
     * logical device that is exposed to the instance as /dev/sda2 (the
     * ephemeral store). The format of this file is suitable for use as an
     * entry within ~/.ssh/authorized_keys (the OpenSSH format). This can be
     * done at boot (e.g., as part of rc.local) allowing for secure access
     * without passwords. Optional user data can be provided in the launch
     * request. All instances that collectively comprise the launch request
     * have access to this data For more information, see Instance Metadata.
     * Note: If any of the AMIs have a product code attached for which the
     * user has not subscribed, the RunInstances call will fail. Important:
     * We strongly recommend using the 2.6.18 Xen stock kernel with the
     * c1.medium and c1.xlarge instances. Although the default Amazon EC2
     * kernels will work, the new kernels provide greater stability and
     * performance for these instance types. For more information about
     * kernels, see Kernels, RAM Disks, and Block Device Mappings.
     * </p>
     *
     * @param runInstancesRequest Container for the necessary parameters to
     *           execute the RunInstances operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         RunInstances service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RunInstancesResult> runInstancesAsync(RunInstancesRequest runInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The DescribeReservedInstances operation describes Reserved Instances
     * that were purchased for use with your account.
     * </p>
     *
     * @param describeReservedInstancesRequest Container for the necessary
     *           parameters to execute the DescribeReservedInstances operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeReservedInstances service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeReservedInstancesResult> describeReservedInstancesAsync(DescribeReservedInstancesRequest describeReservedInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gives you information about your subnets. You can filter the results
     * to return information only about subnets that match criteria you
     * specify. For example, you could ask to get information about a
     * particular subnet (or all) only if the subnet's state is available.
     * You can specify multiple filters (e.g., the subnet is in a particular
     * VPC, and the subnet's state is available). The result includes
     * information for a particular subnet only if the subnet matches all
     * your filters. If there's no match, no special message is returned; the
     * response is simply empty. The following table shows the available
     * filters.
     * </p>
     *
     * @param describeSubnetsRequest Container for the necessary parameters
     *           to execute the DescribeSubnets operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSubnets service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSubnetsResult> describeSubnetsAsync(DescribeSubnetsRequest describeSubnetsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The DescribeAvailabilityZones operation describes availability zones
     * that are currently available to the account and their states.
     * Availability zones are not the same across accounts. The availability
     * zone us-east-1a for account A is not necessarily the same as
     * us-east-1a for account B. Zone assignments are mapped independently
     * for each account.
     * </p>
     *
     * @param describeAvailabilityZonesRequest Container for the necessary
     *           parameters to execute the DescribeAvailabilityZones operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAvailabilityZones service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAvailabilityZonesResult> describeAvailabilityZonesAsync(DescribeAvailabilityZonesRequest describeAvailabilityZonesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Detach a previously attached volume from a running instance.
     * </p>
     *
     * @param detachVolumeRequest Container for the necessary parameters to
     *           execute the DetachVolume operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DetachVolume service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DetachVolumeResult> detachVolumeAsync(DetachVolumeRequest detachVolumeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The DeleteKeyPair operation deletes a key pair.
     * </p>
     *
     * @param deleteKeyPairRequest Container for the necessary parameters to
     *           execute the DeleteKeyPair operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteKeyPair service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteKeyPairAsync(DeleteKeyPairRequest deleteKeyPairRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The DescribeInstances operation returns information about instances
     * that you own. If you specify one or more instance IDs, Amazon EC2
     * returns information for those instances. If you do not specify
     * instance IDs, Amazon EC2 returns information for all relevant
     * instances. If you specify an invalid instance ID, a fault is returned.
     * If you specify an instance that you do not own, it will not be
     * included in the returned results. Recently terminated instances might
     * appear in the returned results. This interval is usually less than one
     * hour.
     * </p>
     *
     * @param describeInstancesRequest Container for the necessary parameters
     *           to execute the DescribeInstances operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeInstances service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeInstancesResult> describeInstancesAsync(DescribeInstancesRequest describeInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The DescribeImages operation returns information about AMIs, AKIs,
     * and ARIs available to the user. Information returned includes image
     * type, product codes, architecture, and kernel and RAM disk IDs. Images
     * available to the user include public images available for any user to
     * launch, private images owned by the user making the request, and
     * private images owned by other users for which the user has explicit
     * launch permissions. Launch permissions fall into three categories:
     * Public: The owner of the AMI granted launch permissions for the AMI to
     * the all group. All users have launch permissions for these AMIs.
     * Explicit: The owner of the AMI granted launch permissions to a
     * specific user. Implicit: A user has implicit launch permissions for
     * all AMIs he or she owns. The list of AMIs returned can be modified by
     * specifying AMI IDs, AMI owners, or users with launch permissions. If
     * no options are specified, Amazon EC2 returns all AMIs for which the
     * user has launch permissions. If you specify one or more AMI IDs, only
     * AMIs that have the specified IDs are returned. If you specify an
     * invalid AMI ID, a fault is returned. If you specify an AMI ID for
     * which you do not have access, it will not be included in the returned
     * results. If you specify one or more AMI owners, only AMIs from the
     * specified owners and for which you have access are returned. The
     * results can include the account IDs of the specified owners, amazon
     * for AMIs owned by Amazon or self for AMIs that you own. If you specify
     * a list of executable users, only users that have launch permissions
     * for the AMIs are returned. You can specify account IDs (if you own the
     * AMI(s)), self for AMIs for which you own or have explicit permissions,
     * or all for public AMIs. Note: Deregistered images are included in the
     * returned results for an unspecified interval after deregistration.
     * </p>
     *
     * @param describeImagesRequest Container for the necessary parameters to
     *           execute the DescribeImages operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeImages service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeImagesResult> describeImagesAsync(DescribeImagesRequest describeImagesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an instance that uses an Amazon EBS volume as its root device.
     * Instances that use Amazon EBS volumes as their root devices can be
     * quickly stopped and started. When an instance is stopped, the compute
     * resources are released and you are not billed for hourly instance
     * usage. However, your root partition Amazon EBS volume remains,
     * continues to persist your data, and you are charged for Amazon EBS
     * volume usage. You can restart your instance at any time. Note: Before
     * stopping an instance, make sure it is in a state from which it can be
     * restarted. Stopping an instance does not preserve data stored in RAM.
     * Performing this operation on an instance that uses an instance store
     * as its root device returns an error.
     * </p>
     *
     * @param startInstancesRequest Container for the necessary parameters to
     *           execute the StartInstances operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         StartInstances service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<StartInstancesResult> startInstancesAsync(StartInstancesRequest startInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disables monitoring for a running instance.
     * </p>
     *
     * @param unmonitorInstancesRequest Container for the necessary
     *           parameters to execute the UnmonitorInstances operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         UnmonitorInstances service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UnmonitorInstancesResult> unmonitorInstancesAsync(UnmonitorInstancesRequest unmonitorInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attaches a VPN gateway to a VPC. This is the last step required to
     * get your VPC fully connected to your data center before launching
     * instances in it. For more information, go to Process for Using Amazon
     * VPC in the Amazon Virtual Private Cloud Developer Guide.
     * </p>
     *
     * @param attachVpnGatewayRequest Container for the necessary parameters
     *           to execute the AttachVpnGateway operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         AttachVpnGateway service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AttachVpnGatewayResult> attachVpnGatewayAsync(AttachVpnGatewayRequest attachVpnGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies an attribute of an instance.
     * </p>
     *
     * @param modifyInstanceAttributeRequest Container for the necessary
     *           parameters to execute the ModifyInstanceAttribute operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyInstanceAttribute service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> modifyInstanceAttributeAsync(ModifyInstanceAttributeRequest modifyInstanceAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a set of DHCP options that you specify. Amazon VPC returns an
     * error if the set of options you specify is currently associated with a
     * VPC. You can disassociate the set of options by associating either a
     * new set of options or the default options with the VPC.
     * </p>
     *
     * @param deleteDhcpOptionsRequest Container for the necessary parameters
     *           to execute the DeleteDhcpOptions operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDhcpOptions service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteDhcpOptionsAsync(DeleteDhcpOptionsRequest deleteDhcpOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The DeleteSecurityGroup operation deletes a security group. Note: If
     * you attempt to delete a security group that contains instances, a
     * fault is returned. If you attempt to delete a security group that is
     * referenced by another security group, a fault is returned. For
     * example, if security group B has a rule that allows access from
     * security group A, security group A cannot be deleted until the allow
     * rule is removed.
     * </p>
     *
     * @param deleteSecurityGroupRequest Container for the necessary
     *           parameters to execute the DeleteSecurityGroup operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteSecurityGroup service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteSecurityGroupAsync(DeleteSecurityGroupRequest deleteSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an AMI that uses an Amazon EBS root device from a "running"
     * or "stopped" instance. AMIs that use an Amazon EBS root device boot
     * faster than AMIs that use instance stores. They can be up to 1 TiB in
     * size, use storage that persists on instance failure, and can be
     * stopped and started.
     * </p>
     *
     * @param createImageRequest Container for the necessary parameters to
     *           execute the CreateImage operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateImage service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateImageResult> createImageAsync(CreateImageRequest createImageRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The AuthorizeSecurityGroupIngress operation adds permissions to a
     * security group. Permissions are specified by the IP protocol (TCP, UDP
     * or ICMP), the source of the request (by IP range or an Amazon EC2
     * user-group pair), the source and destination port ranges (for TCP and
     * UDP), and the ICMP codes and types (for ICMP). When authorizing ICMP,
     * -1 can be used as a wildcard in the type and code fields. Permission
     * changes are propagated to instances within the security group as
     * quickly as possible. However, depending on the number of instances, a
     * small delay might occur. When authorizing a user/group pair
     * permission, GroupName, SourceSecurityGroupName and
     * SourceSecurityGroupOwnerId must be specified. When authorizing a CIDR
     * IP permission, GroupName, IpProtocol, FromPort, ToPort and CidrIp must
     * be specified. Mixing these two types of parameters is not allowed.
     * </p>
     *
     * @param authorizeSecurityGroupIngressRequest Container for the
     *           necessary parameters to execute the AuthorizeSecurityGroupIngress
     *           operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         AuthorizeSecurityGroupIngress service method, as returned by
     *         AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> authorizeSecurityGroupIngressAsync(AuthorizeSecurityGroupIngressRequest authorizeSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates a set of DHCP options (that you've previously created)
     * with the specified VPC. Or, associates the default DHCP options with
     * the VPC. The default set consists of the standard EC2 host name, no
     * domain name, no DNS server, no NTP server, and no NetBIOS server or
     * node type. After you associate the options with the VPC, any existing
     * instances and all new instances that you launch in that VPC use the
     * options. For more information about the supported DHCP options and
     * using them with Amazon VPC, go to Using DHCP Options in the Amazon
     * Virtual Private Cloud Developer Guide.
     * </p>
     *
     * @param associateDhcpOptionsRequest Container for the necessary
     *           parameters to execute the AssociateDhcpOptions operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         AssociateDhcpOptions service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> associateDhcpOptionsAsync(AssociateDhcpOptionsRequest associateDhcpOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the encrypted administrator password for the instances
     * running Windows.
     * </p>
     * <p>
     * <b>NOTE:</b> The Windows password is only generated the first time an
     * AMI is launched. It is not generated for rebundled AMIs or after the
     * password is changed on an instance. The password is encrypted using
     * the key pair that you provided.
     * </p>
     *
     * @param getPasswordDataRequest Container for the necessary parameters
     *           to execute the GetPasswordData operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         GetPasswordData service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetPasswordDataResult> getPasswordDataAsync(GetPasswordDataRequest getPasswordDataRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a VPC with the CIDR block you specify. The smallest VPC you
     * can create uses a /28 netmask (16 IP addresses), and the largest uses
     * a /18 netmask (16,384 IP addresses). To help you decide how big to
     * make your VPC, go to the topic about creating VPCs in the Amazon
     * Virtual Private Cloud Developer Guide. By default, each instance you
     * launch in the VPC has the default DHCP options (the standard EC2 host
     * name, no domain name, no DNS server, no NTP server, and no NetBIOS
     * server or node type).
     * </p>
     *
     * @param createVpcRequest Container for the necessary parameters to
     *           execute the CreateVpc operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateVpc service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateVpcResult> createVpcAsync(CreateVpcRequest createVpcRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops an instance that uses an Amazon EBS volume as its root device.
     * Instances that use Amazon EBS volumes as their root devices can be
     * quickly stopped and started. When an instance is stopped, the compute
     * resources are released and you are not billed for hourly instance
     * usage. However, your root partition Amazon EBS volume remains,
     * continues to persist your data, and you are charged for Amazon EBS
     * volume usage. You can restart your instance at any time. Note: Before
     * stopping an instance, make sure it is in a state from which it can be
     * restarted. Stopping an instance does not preserve data stored in RAM.
     * Performing this operation on an instance that uses an instance store
     * as its root device returns an error.
     * </p>
     *
     * @param stopInstancesRequest Container for the necessary parameters to
     *           execute the StopInstances operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         StopInstances service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<StopInstancesResult> stopInstancesAsync(StopInstancesRequest stopInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gives you information about your customer gateways. You can filter
     * the results to return information only about customer gateways that
     * match criteria you specify. For example, you could ask to get
     * information about a particular customer gateway (or all) only if the
     * gateway's state is pending or available. You can specify multiple
     * filters (e.g., the customer gateway has a particular IP address for
     * the Internet-routable external interface, and the gateway's state is
     * pending or available). The result includes information for a
     * particular customer gateway only if the gateway matches all your
     * filters. If there's no match, no special message is returned; the
     * response is simply empty. The following table shows the available
     * filters.
     * </p>
     *
     * @param describeCustomerGatewaysRequest Container for the necessary
     *           parameters to execute the DescribeCustomerGateways operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCustomerGateways service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCustomerGatewaysResult> describeCustomerGatewaysAsync(DescribeCustomerGatewaysRequest describeCustomerGatewaysRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The CreateSecurityGroup operation creates a new security group. Every
     * instance is launched in a security group. If no security group is
     * specified during launch, the instances are launched in the default
     * security group. Instances within the same security group have
     * unrestricted network access to each other. Instances will reject
     * network access attempts from other instances in a different security
     * group. As the owner of instances you can grant or revoke specific
     * permissions using the AuthorizeSecurityGroupIngress and
     * RevokeSecurityGroupIngress operations.
     * </p>
     *
     * @param createSecurityGroupRequest Container for the necessary
     *           parameters to execute the CreateSecurityGroup operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateSecurityGroup service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createSecurityGroupAsync(CreateSecurityGroupRequest createSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The DescribeRegions operation describes regions zones that are
     * currently available to the account.
     * </p>
     *
     * @param describeRegionsRequest Container for the necessary parameters
     *           to execute the DescribeRegions operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeRegions service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeRegionsResult> describeRegionsAsync(DescribeRegionsRequest describeRegionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a set of DHCP options that you can then associate with one or
     * more VPCs, causing all existing and new instances that you launch in
     * those VPCs to use the set of DHCP options. The following table lists
     * the individual DHCP options you can specify. For more information
     * about the options, go to http://www.ietf.org/rfc/rfc2132.txt
     * </p>
     *
     * @param createDhcpOptionsRequest Container for the necessary parameters
     *           to execute the CreateDhcpOptions operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDhcpOptions service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDhcpOptionsResult> createDhcpOptionsAsync(CreateDhcpOptionsRequest createDhcpOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Resets permission settings for the specified snapshot.
     * </p>
     *
     * @param resetSnapshotAttributeRequest Container for the necessary
     *           parameters to execute the ResetSnapshotAttribute operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ResetSnapshotAttribute service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> resetSnapshotAttributeAsync(ResetSnapshotAttributeRequest resetSnapshotAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The DescribeSecurityGroups operation returns information about
     * security groups that you own. If you specify security group names,
     * information about those security group is returned. Otherwise,
     * information for all security group is returned. If you specify a group
     * that does not exist, a fault is returned.
     * </p>
     *
     * @param describeSecurityGroupsRequest Container for the necessary
     *           parameters to execute the DescribeSecurityGroups operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSecurityGroups service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSecurityGroupsResult> describeSecurityGroupsAsync(DescribeSecurityGroupsRequest describeSecurityGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Detaches a VPN gateway from a VPC. You do this if you're planning to
     * turn off the VPC and not use it anymore. You can confirm a VPN gateway
     * has been completely detached from a VPC by describing the VPN gateway
     * (any attachments to the VPN gateway are also described). You must wait
     * for the attachment's state to switch to detached before you can delete
     * the VPC or attach a different VPC to the VPN gateway.
     * </p>
     *
     * @param detachVpnGatewayRequest Container for the necessary parameters
     *           to execute the DetachVpnGateway operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DetachVpnGateway service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> detachVpnGatewayAsync(DetachVpnGatewayRequest detachVpnGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The DeregisterImage operation deregisters an AMI. Once deregistered,
     * instances of the AMI can no longer be launched.
     * </p>
     *
     * @param deregisterImageRequest Container for the necessary parameters
     *           to execute the DeregisterImage operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterImage service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deregisterImageAsync(DeregisterImageRequest deregisterImageRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a subnet from a VPC. You must terminate all running instances
     * in the subnet before deleting it, otherwise Amazon VPC returns an
     * error.
     * </p>
     *
     * @param deleteSubnetRequest Container for the necessary parameters to
     *           execute the DeleteSubnet operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteSubnet service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteSubnetAsync(DeleteSubnetRequest deleteSubnetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new VPN gateway. A VPN gateway is the VPC-side endpoint for
     * your VPN connection. You can create a VPN gateway before creating the
     * VPC itself.
     * </p>
     *
     * @param createVpnGatewayRequest Container for the necessary parameters
     *           to execute the CreateVpnGateway operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateVpnGateway service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateVpnGatewayResult> createVpnGatewayAsync(CreateVpnGatewayRequest createVpnGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * CancelBundleTask operation cancels a pending or in-progress bundling
     * task. This is an asynchronous call and it make take a while for the
     * task to be cancelled. If a task is cancelled while it is storing
     * items, there may be parts of the incomplete AMI stored in S3. It is up
     * to the caller to clean up these parts from S3.
     * </p>
     *
     * @param cancelBundleTaskRequest Container for the necessary parameters
     *           to execute the CancelBundleTask operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CancelBundleTask service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CancelBundleTaskResult> cancelBundleTaskAsync(CancelBundleTaskRequest cancelBundleTaskRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a VPN gateway. Use this when you want to delete a VPC and all
     * its associated components because you no longer need them. We
     * recommend that before you delete a VPN gateway, you detach it from the
     * VPC and delete the VPN connection. Note that you don't need to delete
     * the VPN gateway if you just want to delete and re-create the VPN
     * connection between your VPC and data center.
     * </p>
     *
     * @param deleteVpnGatewayRequest Container for the necessary parameters
     *           to execute the DeleteVpnGateway operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteVpnGateway service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteVpnGatewayAsync(DeleteVpnGatewayRequest deleteVpnGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attach a previously created volume to a running instance.
     * </p>
     *
     * @param attachVolumeRequest Container for the necessary parameters to
     *           execute the AttachVolume operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         AttachVolume service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AttachVolumeResult> attachVolumeAsync(AttachVolumeRequest attachVolumeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The PurchaseReservedInstancesOffering operation purchases a Reserved
     * Instance for use with your account. With Amazon EC2 Reserved
     * Instances, you purchase the right to launch Amazon EC2 instances for a
     * period of time (without getting insufficient capacity errors) and pay
     * a lower usage rate for the actual time used.
     * </p>
     *
     * @param purchaseReservedInstancesOfferingRequest Container for the
     *           necessary parameters to execute the PurchaseReservedInstancesOffering
     *           operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         PurchaseReservedInstancesOffering service method, as returned by
     *         AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PurchaseReservedInstancesOfferingResult> purchaseReservedInstancesOfferingAsync(PurchaseReservedInstancesOfferingRequest purchaseReservedInstancesOfferingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The ResetImageAttribute operation resets an attribute of an AMI to
     * its default value. Note: The productCodes attribute cannot be reset.
     * </p>
     *
     * @param resetImageAttributeRequest Container for the necessary
     *           parameters to execute the ResetImageAttribute operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ResetImageAttribute service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> resetImageAttributeAsync(ResetImageAttributeRequest resetImageAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gives you information about your VPN connections. Important We
     * strongly recommend you use HTTPS when calling this operation because
     * the response contains sensitive cryptographic information for
     * configuring your customer gateway. You can filter the results to
     * return information only about VPN connections that match criteria you
     * specify. For example, you could ask to get information about a
     * particular VPN connection (or all) only if the VPN's state is pending
     * or available. You can specify multiple filters (e.g., the VPN
     * connection is associated with a particular VPN gateway, and the
     * gateway's state is pending or available). The result includes
     * information for a particular VPN connection only if the VPN connection
     * matches all your filters. If there's no match, no special message is
     * returned; the response is simply empty. The following table shows the
     * available filters.
     * </p>
     *
     * @param describeVpnConnectionsRequest Container for the necessary
     *           parameters to execute the DescribeVpnConnections operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVpnConnections service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVpnConnectionsResult> describeVpnConnectionsAsync(DescribeVpnConnectionsRequest describeVpnConnectionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Create a snapshot of the volume identified by volume ID. A volume
     * does not have to be detached at the time the snapshot is taken.
     * Important Note: Snapshot creation requires that the system is in a
     * consistent state. For instance, this means that if taking a snapshot
     * of a database, the tables must be read-only locked to ensure that the
     * snapshot will not contain a corrupted version of the database.
     * Therefore, be careful when using this API to ensure that the system
     * remains in the consistent state until the create snapshot status has
     * returned.
     * </p>
     *
     * @param createSnapshotRequest Container for the necessary parameters to
     *           execute the CreateSnapshot operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateSnapshot service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest createSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a previously created volume. Once successfully deleted, a
     * new volume can be created with the same name.
     * </p>
     *
     * @param deleteVolumeRequest Container for the necessary parameters to
     *           execute the DeleteVolume operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteVolume service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteVolumeAsync(DeleteVolumeRequest deleteVolumeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds or remove permission settings for the specified snapshot.
     * </p>
     *
     * @param modifySnapshotAttributeRequest Container for the necessary
     *           parameters to execute the ModifySnapshotAttribute operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ModifySnapshotAttribute service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> modifySnapshotAttributeAsync(ModifySnapshotAttributeRequest modifySnapshotAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The TerminateInstances operation shuts down one or more instances.
     * This operation is idempotent; if you terminate an instance more than
     * once, each call will succeed. Terminated instances will remain visible
     * after termination (approximately one hour).
     * </p>
     *
     * @param terminateInstancesRequest Container for the necessary
     *           parameters to execute the TerminateInstances operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         TerminateInstances service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<TerminateInstancesResult> terminateInstancesAsync(TerminateInstancesRequest terminateInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gives you information about your VPCs. You can filter the results to
     * return information only about VPCs that match criteria you specify.
     * For example, you could ask to get information about a particular VPC
     * or VPCs (or all your VPCs) only if the VPC's state is available. You
     * can specify multiple filters (e.g., the VPC uses one of several sets
     * of DHCP options, and the VPC's state is available). The result
     * includes information for a particular VPC only if the VPC matches all
     * your filters. If there's no match, no special message is returned; the
     * response is simply empty. The following table shows the available
     * filters.
     * </p>
     *
     * @param describeVpcsRequest Container for the necessary parameters to
     *           execute the DescribeVpcs operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVpcs service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVpcsResult> describeVpcsAsync(DescribeVpcsRequest describeVpcsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The AssociateAddress operation associates an elastic IP address with
     * an instance. If the IP address is currently assigned to another
     * instance, the IP address is assigned to the new instance. This is an
     * idempotent operation. If you enter it more than once, Amazon EC2 does
     * not return an error.
     * </p>
     *
     * @param associateAddressRequest Container for the necessary parameters
     *           to execute the AssociateAddress operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         AssociateAddress service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> associateAddressAsync(AssociateAddressRequest associateAddressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a customer gateway. You must delete the VPN connection before
     * deleting the customer gateway. You can have a single active customer
     * gateway per AWS account (active means that you've created a VPN
     * connection with that customer gateway). AWS might delete any customer
     * gateway you leave inactive for an extended period of time.
     * </p>
     *
     * @param deleteCustomerGatewayRequest Container for the necessary
     *           parameters to execute the DeleteCustomerGateway operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteCustomerGateway service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteCustomerGatewayAsync(DeleteCustomerGatewayRequest deleteCustomerGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about an attribute of a snapshot. Only one
     * attribute can be specified per call.
     * </p>
     *
     * @param describeSnapshotAttributeRequest Container for the necessary
     *           parameters to execute the DescribeSnapshotAttribute operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSnapshotAttribute service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSnapshotAttributeResult> describeSnapshotAttributeAsync(DescribeSnapshotAttributeRequest describeSnapshotAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The DescribeAddresses operation lists elastic IP addresses assigned
     * to your account.
     * </p>
     *
     * @param describeAddressesRequest Container for the necessary parameters
     *           to execute the DescribeAddresses operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAddresses service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAddressesResult> describeAddressesAsync(DescribeAddressesRequest describeAddressesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The DescribeImageAttribute operation returns information about an
     * attribute of an AMI. Only one attribute can be specified per call.
     * </p>
     *
     * @param describeImageAttributeRequest Container for the necessary
     *           parameters to execute the DescribeImageAttribute operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeImageAttribute service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeImageAttributeResult> describeImageAttributeAsync(DescribeImageAttributeRequest describeImageAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The DescribeKeyPairs operation returns information about key pairs
     * available to you. If you specify key pairs, information about those
     * key pairs is returned. Otherwise, information for all registered key
     * pairs is returned.
     * </p>
     *
     * @param describeKeyPairsRequest Container for the necessary parameters
     *           to execute the DescribeKeyPairs operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeKeyPairs service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeKeyPairsResult> describeKeyPairsAsync(DescribeKeyPairsRequest describeKeyPairsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The ConfirmProductInstance operation returns true if the specified
     * product code is attached to the specified instance. The operation
     * returns false if the product code is not attached to the instance. The
     * ConfirmProductInstance operation can only be executed by the owner of
     * the AMI. This feature is useful when an AMI owner is providing support
     * and wants to verify whether a user's instance is eligible.
     * </p>
     *
     * @param confirmProductInstanceRequest Container for the necessary
     *           parameters to execute the ConfirmProductInstance operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ConfirmProductInstance service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ConfirmProductInstanceResult> confirmProductInstanceAsync(ConfirmProductInstanceRequest confirmProductInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Initializes an empty volume of a given size
     * </p>
     *
     * @param createVolumeRequest Container for the necessary parameters to
     *           execute the CreateVolume operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateVolume service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateVolumeResult> createVolumeAsync(CreateVolumeRequest createVolumeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gives you information about your VPN gateways. You can filter the
     * results to return information only about VPN gateways that match
     * criteria you specify. For example, you could ask to get information
     * about a particular VPN gateway (or all) only if the gateway's state is
     * pending or available. You can specify multiple filters (e.g., the VPN
     * gateway is in a particular Availability Zone and the gateway's state
     * is pending or available). The result includes information for a
     * particular VPN gateway only if the gateway matches all your filters.
     * If there's no match, no special message is returned; the response is
     * simply empty. The following table shows the available filters.
     * </p>
     *
     * @param describeVpnGatewaysRequest Container for the necessary
     *           parameters to execute the DescribeVpnGateways operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVpnGateways service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVpnGatewaysResult> describeVpnGatewaysAsync(DescribeVpnGatewaysRequest describeVpnGatewaysRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a subnet in an existing VPC. You can create up to 20 subnets
     * in a VPC. If you add more than one subnet to a VPC, they're set up in
     * a star topology with a logical router in the middle. When you create
     * each subnet, you provide the VPC ID and the CIDR block you want for
     * the subnet. Once you create a subnet, you can't change its CIDR block.
     * The subnet's CIDR block can be the same as the VPC's CIDR block
     * (assuming you want only a single subnet in the VPC), or a subset of
     * the VPC's CIDR block. If you create more than one subnet in a VPC, the
     * subnets' CIDR blocks must not overlap. The smallest subnet (and VPC)
     * you can create uses a /28 netmask (16 IP addresses), and the largest
     * uses a /18 netmask (16,384 IP addresses). Important: AWS reserves both
     * the first four and the last IP address in each subnet's CIDR block.
     * They're not available for use.
     * </p>
     *
     * @param createSubnetRequest Container for the necessary parameters to
     *           execute the CreateSubnet operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateSubnet service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateSubnetResult> createSubnetAsync(CreateSubnetRequest createSubnetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The DescribeReservedInstancesOfferings operation describes Reserved
     * Instance offerings that are available for purchase. With Amazon EC2
     * Reserved Instances, you purchase the right to launch Amazon EC2
     * instances for a period of time (without getting insufficient capacity
     * errors) and pay a lower usage rate for the actual time used.
     * </p>
     *
     * @param describeReservedInstancesOfferingsRequest Container for the
     *           necessary parameters to execute the DescribeReservedInstancesOfferings
     *           operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeReservedInstancesOfferings service method, as returned by
     *         AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeReservedInstancesOfferingsResult> describeReservedInstancesOfferingsAsync(DescribeReservedInstancesOfferingsRequest describeReservedInstancesOfferingsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the status of the indicated or, in lieu of any specified,
     * all volumes belonging to the caller. Volumes that have been deleted
     * are not described.
     * </p>
     *
     * @param describeVolumesRequest Container for the necessary parameters
     *           to execute the DescribeVolumes operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVolumes service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVolumesResult> describeVolumesAsync(DescribeVolumesRequest describeVolumesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the snapshot identitied by snapshotId.
     * </p>
     *
     * @param deleteSnapshotRequest Container for the necessary parameters to
     *           execute the DeleteSnapshot operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteSnapshot service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteSnapshotAsync(DeleteSnapshotRequest deleteSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gives you information about one or more sets of DHCP options. You can
     * specify one or more DHCP options set IDs, or no IDs (to describe all
     * your sets of DHCP options). The returned information consists of: -
     * The DHCP options set ID - The options
     * </p>
     *
     * @param describeDhcpOptionsRequest Container for the necessary
     *           parameters to execute the DescribeDhcpOptions operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDhcpOptions service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDhcpOptionsResult> describeDhcpOptionsAsync(DescribeDhcpOptionsRequest describeDhcpOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables monitoring for a running instance.
     * </p>
     *
     * @param monitorInstancesRequest Container for the necessary parameters
     *           to execute the MonitorInstances operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         MonitorInstances service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<MonitorInstancesResult> monitorInstancesAsync(MonitorInstancesRequest monitorInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The DisassociateAddress operation disassociates the specified elastic
     * IP address from the instance to which it is assigned. This is an
     * idempotent operation. If you enter it more than once, Amazon EC2 does
     * not return an error.
     * </p>
     *
     * @param disassociateAddressRequest Container for the necessary
     *           parameters to execute the DisassociateAddress operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DisassociateAddress service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> disassociateAddressAsync(DisassociateAddressRequest disassociateAddressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The DescribeBundleTasks operation describes in-progress and recent
     * bundle tasks. Complete and failed tasks are removed from the list a
     * short time after completion. If no bundle ids are given, all bundle
     * tasks are returned.
     * </p>
     *
     * @param describeBundleTasksRequest Container for the necessary
     *           parameters to execute the DescribeBundleTasks operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeBundleTasks service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeBundleTasksResult> describeBundleTasksAsync(DescribeBundleTasksRequest describeBundleTasksRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The BundleInstance operation request that an instance is bundled the
     * next time it boots. The bundling process creates a new image from a
     * running instance and stores the AMI data in S3. Once bundled, the
     * image must be registered in the normal way using the RegisterImage
     * API.
     * </p>
     *
     * @param bundleInstanceRequest Container for the necessary parameters to
     *           execute the BundleInstance operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         BundleInstance service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<BundleInstanceResult> bundleInstanceAsync(BundleInstanceRequest bundleInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The RevokeSecurityGroupIngress operation revokes permissions from a
     * security group. The permissions used to revoke must be specified using
     * the same values used to grant the permissions. Permissions are
     * specified by IP protocol (TCP, UDP, or ICMP), the source of the
     * request (by IP range or an Amazon EC2 user-group pair), the source and
     * destination port ranges (for TCP and UDP), and the ICMP codes and
     * types (for ICMP). Permission changes are quickly propagated to
     * instances within the security group. However, depending on the number
     * of instances in the group, a small delay is might occur, . When
     * revoking a user/group pair permission, GroupName,
     * SourceSecurityGroupName and SourceSecurityGroupOwnerId must be
     * specified. When authorizing a CIDR IP permission, GroupName,
     * IpProtocol, FromPort, ToPort and CidrIp must be specified. Mixing
     * these two types of parameters is not allowed.
     * </p>
     *
     * @param revokeSecurityGroupIngressRequest Container for the necessary
     *           parameters to execute the RevokeSecurityGroupIngress operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         RevokeSecurityGroupIngress service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> revokeSecurityGroupIngressAsync(RevokeSecurityGroupIngressRequest revokeSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a VPC. You must terminate all running instances and delete
     * all subnets before deleting the VPC, otherwise Amazon VPC returns an
     * error.
     * </p>
     *
     * @param deleteVpcRequest Container for the necessary parameters to
     *           execute the DeleteVpc operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteVpc service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteVpcAsync(DeleteVpcRequest deleteVpcRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The GetConsoleOutput operation retrieves console output for the
     * specified instance. Instance console output is buffered and posted
     * shortly after instance boot, reboot, and termination. Amazon EC2
     * preserves the most recent 64 KB output which will be available for at
     * least one hour after the most recent post.
     * </p>
     *
     * @param getConsoleOutputRequest Container for the necessary parameters
     *           to execute the GetConsoleOutput operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         GetConsoleOutput service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetConsoleOutputResult> getConsoleOutputAsync(GetConsoleOutputRequest getConsoleOutputRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The AllocateAddress operation acquires an elastic IP address for use
     * with your account.
     * </p>
     *
     * @param allocateAddressRequest Container for the necessary parameters
     *           to execute the AllocateAddress operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         AllocateAddress service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AllocateAddressResult> allocateAddressAsync(AllocateAddressRequest allocateAddressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The ModifyImageAttribute operation modifies an attribute of an AMI.
     * </p>
     *
     * @param modifyImageAttributeRequest Container for the necessary
     *           parameters to execute the ModifyImageAttribute operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyImageAttribute service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> modifyImageAttributeAsync(ModifyImageAttributeRequest modifyImageAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The ReleaseAddress operation releases an elastic IP address
     * associated with your account. Note: Releasing an IP address
     * automatically disassociates it from any instance with which it is
     * associated. For more information, see DisassociateAddress. Important:
     * After releasing an elastic IP address, it is released to the IP
     * address pool and might no longer be available to your account. Make
     * sure to update your DNS records and any servers or devices that
     * communicate with the address. If you run this operation on an elastic
     * IP address that is already released, the address might be assigned to
     * another account which will cause Amazon EC2 to return an error.
     * </p>
     *
     * @param releaseAddressRequest Container for the necessary parameters to
     *           execute the ReleaseAddress operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ReleaseAddress service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> releaseAddressAsync(ReleaseAddressRequest releaseAddressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information to AWS about your customer gateway device. The
     * customer gateway is the appliance at your end of the VPN connection
     * (compared to the VPN gateway, which is the device at the AWS side of
     * the VPN connection). You can have a single active customer gateway per
     * AWS account (active means that you've created a VPN connection to use
     * with the customer gateway). AWS might delete any customer gateway that
     * you create with this operation if you leave it inactive for an
     * extended period of time. You must provide the Internet-routable IP
     * address of the customer gateway's external interface. The IP address
     * must be static. You must also provide the device's Border Gateway
     * Protocol (BGP) Autonomous System Number (ASN). You can use an existing
     * ASN assigned to your network. If you don't have an ASN already, you
     * can use a private ASN (in the 64512 - 65534 range). For more
     * information about ASNs, go to
     * http://en.wikipedia.org/wiki/Autonomous_system_%28Internet%29.
     * </p>
     *
     * @param createCustomerGatewayRequest Container for the necessary
     *           parameters to execute the CreateCustomerGateway operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCustomerGateway service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateCustomerGatewayResult> createCustomerGatewayAsync(CreateCustomerGatewayRequest createCustomerGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Resets an attribute of an instance to its default value.
     * </p>
     *
     * @param resetInstanceAttributeRequest Container for the necessary
     *           parameters to execute the ResetInstanceAttribute operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ResetInstanceAttribute service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> resetInstanceAttributeAsync(ResetInstanceAttributeRequest resetInstanceAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The CreateKeyPair operation creates a new 2048 bit RSA key pair and
     * returns a unique ID that can be used to reference this key pair when
     * launching new instances. For more information, see RunInstances.
     * </p>
     *
     * @param createKeyPairRequest Container for the necessary parameters to
     *           execute the CreateKeyPair operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateKeyPair service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateKeyPairResult> createKeyPairAsync(CreateKeyPairRequest createKeyPairRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the indicated snapshots, or in lieu of that, all snapshots
     * owned by the caller.
     * </p>
     *
     * @param describeSnapshotsRequest Container for the necessary parameters
     *           to execute the DescribeSnapshots operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSnapshots service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSnapshotsResult> describeSnapshotsAsync(DescribeSnapshotsRequest describeSnapshotsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The RegisterImage operation registers an AMI with Amazon EC2. Images
     * must be registered before they can be launched. For more information,
     * see RunInstances. Each AMI is associated with an unique ID which is
     * provided by the Amazon EC2 service through the RegisterImage
     * operation. During registration, Amazon EC2 retrieves the specified
     * image manifest from Amazon S3 and verifies that the image is owned by
     * the user registering the image. The image manifest is retrieved once
     * and stored within the Amazon EC2. Any modifications to an image in
     * Amazon S3 invalidates this registration. If you make changes to an
     * image, deregister the previous image and register the new image. For
     * more information, see DeregisterImage.
     * </p>
     *
     * @param registerImageRequest Container for the necessary parameters to
     *           execute the RegisterImage operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterImage service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterImageResult> registerImageAsync(RegisterImageRequest registerImageRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a VPN connection. Use this if you want to delete a VPC and
     * all its associated components. Another reason to use this operation is
     * if you believe the tunnel credentials for your VPN connection have
     * been compromised. In that situation, you can delete the VPN connection
     * and create a new one that has new keys, without needing to delete the
     * VPC or VPN gateway. If you create a new VPN connection, you must
     * reconfigure the customer gateway using the new configuration
     * information returned with the new VPN connection ID. If you're
     * deleting the VPC and all its associated parts, we recommend you detach
     * the VPN gateway from the VPC and delete the VPC before deleting the
     * VPN connection.
     * </p>
     *
     * @param deleteVpnConnectionRequest Container for the necessary
     *           parameters to execute the DeleteVpnConnection operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteVpnConnection service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteVpnConnectionAsync(DeleteVpnConnectionRequest deleteVpnConnectionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new VPN connection between an existing VPN gateway and
     * customer gateway. The only supported connection type is ipsec.1. The
     * response includes information that you need to configure your customer
     * gateway, in XML format. We recommend you use the command line version
     * of this operation (ec2-create-vpn-connection), which takes an -f
     * option (for format) and returns configuration information formatted as
     * expected by the vendor you specified, or in a generic, human readable
     * format. For information about the command, go to
     * ec2-create-vpn-connection in the Amazon Virtual Private Cloud Command
     * Line Reference. Important We strongly recommend you use HTTPS when
     * calling this operation because the response contains sensitive
     * cryptographic information for configuring your customer gateway. If
     * you decide to shut down your VPN connection for any reason and then
     * create a new one, you must re-configure your customer gateway with the
     * new information returned from this call.
     * </p>
     *
     * @param createVpnConnectionRequest Container for the necessary
     *           parameters to execute the CreateVpnConnection operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateVpnConnection service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateVpnConnectionResult> createVpnConnectionAsync(CreateVpnConnectionRequest createVpnConnectionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about an attribute of an instance. Only one
     * attribute can be specified per call.
     * </p>
     *
     * @param describeInstanceAttributeRequest Container for the necessary
     *           parameters to execute the DescribeInstanceAttribute operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeInstanceAttribute service method, as returned by AmazonEC2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeInstanceAttributeResult> describeInstanceAttributeAsync(DescribeInstanceAttributeRequest describeInstanceAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

}
        