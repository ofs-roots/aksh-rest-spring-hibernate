package com.ofs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ofs.model.HostGroupChild;
import com.ofs.model.HostGroupModel;
import com.ofs.model.UserDetails;
import com.ofs.service.UserService;

@RestController
@RequestMapping("/user")

public class UserController {
	UserService userService = new UserService();
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public int create(UserDetails user) {
		return userService.createUser(user);
	}
	

   HostGroupModel  hostgroup = new HostGroupModel();
			@RequestMapping(value = "/get", method = RequestMethod.GET)
			
			public  HostGroupModel getHostGroup() {
				hostgroup.setId(1);
				hostgroup.setParent_id(23);
				hostgroup.setName("Catch all");
				hostgroup.setHost_baseline(true);
				hostgroup.setHost_trap(true);
				hostgroup.setInverse_suppression(true);
				hostgroup.setSuppress_excluded_services(true);
				hostgroup.setSend_to_cta(true);
				hostgroup.setDescription("sd");
				hostgroup.setIp_address_ranges(new String[] {"10.0.0.0/8","192.168.0.0/16","172.16.0.0/12","fc00::/7"});
				
				return hostgroup;
				
				
			}
			@RequestMapping(value = "/getprint", method = RequestMethod.GET)
			public String getPrintStatement() {
				
				return "Welcome to Jersey";
			}
			
			@RequestMapping(value ="/hostGroupChild", method = RequestMethod.POST)
			
			public HostGroupChild gethostgroupchild() {
				
				 HostGroupChild hostgroupchild = new  HostGroupChild();
				hostgroupchild.setChild_id(1);
				hostgroupchild.setId(1);
				hostgroupchild.setName("Servers");
				hostgroupchild.setHost_baseline(true);
				hostgroupchild.setSuppress_excluded_services(true);
				hostgroupchild.setHost_trap(false);
				hostgroupchild.setInverse_suppression(false);
				hostgroupchild.setSend_to_cta(true);
				hostgroupchild.setDescription("desc");
				hostgroupchild.setIp_address_ranges(new String[] {"10.0.0.0/8",
		                "172.16.0.0/12",
		                "192.168.0.0/16",
		                "fc00::/7"});
				return hostgroupchild;
				
				
			}

	}



