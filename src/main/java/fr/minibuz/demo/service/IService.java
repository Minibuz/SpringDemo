package fr.minibuz.demo.service;

import fr.minibuz.demo.dvo.DataDvo;

public interface IService {

    /**
     * Do something.
     *
     * @param key
     *          {@link String}
     * @return
     *          {@link DataDvo}
     */
    DataDvo getData(String key);
}
