package com.example.controller.Account;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.pojo.VIP.VIP_InFormation;
import com.example.service.VIPAccount.AccountService;
@Controller
@RequestMapping(value="/account")
public class AccountContrller {
	@Autowired
	private AccountService accountService;	
	@ResponseBody 
	@RequestMapping(value="/balance",produces="application/json;charset=UTF-8")
	public List<VIP_InFormation> selectVIPByBalance(@RequestParam(value="vip_Balance",required=false,defaultValue="100")
	Integer vip_Balance){
	return accountService.selectVIPByBalance(vip_Balance);	
	}
}