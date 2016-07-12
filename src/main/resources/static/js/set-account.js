window.onload=function()
{
	var bt =document.getElementById("bt");
	bt.onclick=function()
	{
		if(document.set_base.EmpINo.value=="")
		{
			alert("员工编号不能为空");
			document.set_base.EmpINo.focus();
			return false;
		}
		else if(document.set_base.AllowRatio.value=="")
		{
			alert("津贴系数不能为空");
			document.set_base.AllowRatio.focus();
			return false;
		}
		else if(document.set_base.SalClass.value=="")
		{
			alert("工资类别不能为空");
			document.set_base.SalClass.focus();
			return false;
		}
		else if(document.set_base.BankName.value=="")
		{
			alert("发放银行不能为空");
			document.set_base.BankName.focus();
			return false;
		}
		else if(document.set_base.BankNo.value=="")
		{
			alert("银行卡号不能为空");
			document.set_base.BankNo.focus();
			return false;
		}
		else if(document.set_base.PerTaxRank.value=="")
		{
			alert("个人所得税不能为空");
			document.set_base.PerTaxRank.focus();
			return false;
		}
		else if(document.set_base.SalAuth.value=="")
		{
			alert("工资权限不能为空");
			document.set_base.SalAuth.focus();
			return false;
		}
		else if(document.set_base.Currency.value=="")
		{
			alert("币种不能为空");
			document.set_base.Currency.focus();
			return false;
		}
			
	}
}

function testlength()
{
	var BankNo = document.getElementById("BankNo");
	if(BankNo.value.length!=11)
	{
		alert("请输入正确的银行号");
	}
}
