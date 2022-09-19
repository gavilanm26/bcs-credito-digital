package com.bcs.certification.digitalloan.UI;

import net.serenitybdd.screenplay.targets.Target;

public class promissoryNoteUI {

    public static final Target TEXT_VALIDATE_PROMISSORYNOTE =
            Target.the("confirm that you are on the promissory note screen")
                    .locatedBy("//P[@class='font-light'][text()='Firma de pagaré']"
                    );

    public static final Target READ_DOCUMENT =
            Target.the("read document")
                    .locatedBy("//P[@class='mb-[22px] text-primary-200 text-xl font-semibold cursor-pointer'][text()='Leer documento']"
                    );

    public static final Target TEXT_VALIDATE_DOCUMENT =
            Target.the("validate document")
                    .locatedBy("//H1[@class='text-center font-semibold text-[28px] leading-[30px] text-gray-100 justify-center px-8 md:mb-[14px] lg:w-96 lg:text-[28px] lg:leading-[30px]'][text()='Firmar pagaré']"
                    );

    public static final Target CLOSE_DOCUMENT =
            Target.the("close document")
                    .locatedBy("//button[@class='text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm p-1.5 ml-auto inline-flex items-center dark:hover:bg-gray-600 dark:hover:text-white']"
                    );

    public static final Target BTN_MODAL_ACCEPT_DOCUMENT =
            Target.the("accept document modal")
                    .locatedBy("//BUTTON[@id='btn-modal']"
                    );

    public static final Target BTN_ACCEPT_DOCUMENT =
            Target.the("accept document")
                    .locatedBy("//BUTTON[@id='btn-accept-pay-terms']"
                    );
}
