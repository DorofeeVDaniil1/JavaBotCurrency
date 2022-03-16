package daniil.examplebot.service;


import daniil.examplebot.entity.Currency;
import daniil.examplebot.service.impl.NbrbCurrencyConversionService;

public interface CurrencyConversionService {

  static CurrencyConversionService getInstance() {
    return (CurrencyConversionService) new NbrbCurrencyConversionService();
  }

  double getConversionRatio(Currency original, Currency target);
}
