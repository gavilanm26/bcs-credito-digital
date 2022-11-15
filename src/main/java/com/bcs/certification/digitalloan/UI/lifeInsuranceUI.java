package com.bcs.certification.digitalloan.UI;

import net.serenitybdd.screenplay.targets.Target;

public class lifeInsuranceUI {

    public static final Target TEXT_VALIDATE_LIFEINSURANCE =
        Target.the("confirm that you are on the life insurance screen")
            .locatedBy("//P[@class='font-light'][text()='Seguro de vida']"
            );

    public static final Target HREF_SEE_DETAILS =
        Target.the("see details")
            .locatedBy("//P[@class='font-semibold text-lg text-primary-200 ml-4 cursor-pointer'][text()='Ver detalles']"
            );

    public static final Target TEXT_VALIDATE_DETAILS =
        Target.the("confirm that you are on the details life insurance screen")
            .locatedBy("//H1[@class='text-center font-semibold text-[28px] leading-[30px] text-gray-100 justify-center px-8 md:mb-[14px] lg:w-96 lg:text-[28px] lg:leading-[30px]'][text()='Detalles del seguro de vida']"
            );

    public static final Target CLOSE_DETAILS =
        Target.the("close details")
            .locatedBy("//button[@class='text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm p-1.5 ml-auto inline-flex items-center dark:hover:bg-gray-600 dark:hover:text-white']"
            );

    public static final Target SELECT_BENEFICIARIES =
        Target.the("select the number of beneficiaries")
            .locatedBy("//SELECT[@id='beneficiaries']"
            );

    public static final Target INPUT_FIRSTNAME =
        Target.the("write beneficiary name")
            .locatedBy("//INPUT[@id='firstName_0']"
            );

    public static final Target INPUT_LASTNAME =
        Target.the("write beneficiary last name")
            .locatedBy("//INPUT[@id='surname_0']"
            );

    public static final Target SELECT_RELATIONSHIP =
        Target.the("select relationship")
            .locatedBy("//SELECT[@id='kinship_0']"
            );

    public static final Target SELECT_PERCENTAGE =
        Target.the("select percentage")
            .locatedBy("//SELECT[@id='percentage_0']"
            );

    public static final Target BTN_CONTINUE =
        Target.the("click continue button")
            .locatedBy("//BUTTON[@id='btn-save-beneficiaries']"
            );
}
