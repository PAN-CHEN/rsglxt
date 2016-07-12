package scu.controller.GZGLXT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.data.domain.Persistable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import scu.model.*;
import scu.repository.*;


import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by DAi on 16/7/10.
 */
@Controller
@RequestMapping("/set")
public class SetController {

    @Autowired SalClassRepository salClassRepository;
    @Autowired PertaxrankRepository pertaxrankRepository;
    @Autowired
    DepartRepository departRepository;
    @Autowired
    EmplinfoRepository emplinfoRepository;
    @Autowired
    private UserfactorRepository userfactorRepository;
    @Autowired
    FormalemplallowratioRepository formalemplallowratioRepository;
    @Autowired
    EmplsalbankRepository emplsalbankRepository;
    @Autowired
    EmplsalsetRepository emplsalsetRepository;
    @Autowired
    EduallowRepository eduallowRepository;

    @RequestMapping(value = "/account", method = RequestMethod.GET)
    public String set_account(Model model, HttpSession session){
        List<Salclass> salclasses = salClassRepository.findAll();
        List<Pertaxrank> pertaxranks = pertaxrankRepository.findAll();
        List<Department> departments = departRepository.findAll();

        model.addAttribute("pertaxranks", pertaxranks);
        model.addAttribute("salclasses", salclasses);
        model.addAttribute("departments", departments);
        return "set-account";
    }

    @RequestMapping(value = "/account/post", method = RequestMethod.POST)
    public String set_account_post(Model model, HttpSession session,
                                 @RequestParam(value = "Emplno", required = true) String s_emplno,
                                 @RequestParam(value = "AllowRatio", required = false) String s_allowRatio,
                                 @RequestParam(value = "SalClass", required = true) String salclass,
                                 @RequestParam(value = "BankName", required = true) String bankname,
                                 @RequestParam(value = "BankNo", required = true) String bankno,
                                 @RequestParam(value = "PerTaxRank", required = true) String pertaxrank,
                                 @RequestParam(value = "SalAuth", required = true) String salauth,
                                 @RequestParam(value = "Currency", required = true) String currency) {

        //判断员工是否存在
        int emplno = Integer.parseInt(s_emplno);
        Double allowRatio = Double.parseDouble(s_allowRatio);
        Emplinfo emplinfos = emplinfoRepository.findOne(emplno);
        System.out.print("1");
        if (emplinfos != null) {//员工存在
            //判断是否为试用期员工
            System.out.print("1");
            Userfactor userfactors = userfactorRepository.findOne(emplno);
            if (!userfactors.getUserfactor().equals("试用期")) {//非试用期员工
                System.out.print("1");
            } else {
                allowRatio = eduallowRepository.findOne(emplinfos.getEdu()).getAllowratio();
            }
            Formalemplallowratio f = new Formalemplallowratio();
            f.setEmplno(emplno);
            f.setAllowratio(allowRatio);
            formalemplallowratioRepository.save(f);
            if (bankno.matches("^\\d{19}$")) {
                Emplsalbank emplsalbank = new Emplsalbank();
                emplsalbank.setEmplno(emplno);
                emplsalbank.setBankname(bankname);
                emplsalbank.setBankno(bankno);
                emplsalbankRepository.save(emplsalbank);
            } else {
                System.out.print("123");
                }
            Emplsalset emplsalset = new Emplsalset();
            emplsalset.setEmplno(emplno);
            emplsalset.setCurrency(currency);
            emplsalset.setPertaxrank(pertaxrank);
            emplsalset.setSalauth(salauth);
            emplsalsetRepository.save(emplsalset);
            }
            return "redirect:/set/account";
        }




    @RequestMapping(value = "/base",method = RequestMethod.GET)
    public String set_base(){
        return "base-set";
    }
}
