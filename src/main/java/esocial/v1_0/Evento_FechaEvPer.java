package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-1299 - Fechamento dos Eventos Periódicos */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtFechaEvPer",
    })
@XmlRootElement(name = "eSocial")
public class Evento_FechaEvPer {

  /** Evento Fechamento dos Eventos Periódicos. */
  private EvtFechaEvPer evtFechaEvPer;

  /**
   * Evento Fechamento dos Eventos Periódicos.
   *
   * @return Conteúdo do campo evtFechaEvPer
   */
  public EvtFechaEvPer getEvtFechaEvPer() {
    return this.evtFechaEvPer;
  }

  /**
   * Evento Fechamento dos Eventos Periódicos.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EVE_FOPAG_SIMPLIFICADO
   *
   * <p>REGRA:REGRA_EXISTE_INFO_EMPREGADOR
   *
   * <p>REGRA:REGRA_REMUN_ANUAL_DEZEMBRO
   *
   * <p>REGRA:REGRA_VALIDA_EMPREGADOR
   *
   * <p>REGRA:REGRA_VALIDA_FECHAMENTO_FOPAG
   *
   * @return O objeto EvtFechaEvPer para população dos campos filhos
   */
  public EvtFechaEvPer<Evento_FechaEvPer> setEvtFechaEvPer() {
    if (this.evtFechaEvPer == null) {
      this.evtFechaEvPer = new EvtFechaEvPer(this);
    }
    return this.evtFechaEvPer;
  }

  /**
   * Evento Fechamento dos Eventos Periódicos.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "infoFech",
      })
  public static class EvtFechaEvPer<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_folha_sem_retificacao ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /** Informações do fechamento. */
    private InfoFech infoFech;

    /**
     * Informações de identificação do evento.
     *
     * @return Conteúdo do campo ideEvento
     */
    public Tipos.T_ideEvento_folha_sem_retificacao getIdeEvento() {
      return this.ideEvento;
    }

    /**
     * Informações de identificação do evento.
     *
     * <p>CHAVE_GRUPO: {indApuracao}, {perApur}, {indGuia}
     *
     * @return O objeto Tipos.T_ideEvento_folha_sem_retificacao para população dos campos filhos
     */
    public Tipos.T_ideEvento_folha_sem_retificacao<EvtFechaEvPer<T>> setIdeEvento() {
      if (this.ideEvento == null) {
        this.ideEvento = new Tipos.T_ideEvento_folha_sem_retificacao(this);
      }
      return this.ideEvento;
    }

    /**
     * Informações de identificação do empregador.
     *
     * @return Conteúdo do campo ideEmpregador
     */
    public Tipos.T_ideEmpregador getIdeEmpregador() {
      return this.ideEmpregador;
    }

    /**
     * Informações de identificação do empregador.
     *
     * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}
     *
     * @return O objeto Tipos.T_ideEmpregador para população dos campos filhos
     */
    public Tipos.T_ideEmpregador<EvtFechaEvPer<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Informações do fechamento.
     *
     * @return Conteúdo do campo infoFech
     */
    public InfoFech getInfoFech() {
      return this.infoFech;
    }

    /**
     * Informações do fechamento.
     *
     * @return O objeto InfoFech para população dos campos filhos
     */
    public InfoFech<EvtFechaEvPer<T>> setInfoFech() {
      if (this.infoFech == null) {
        this.infoFech = new InfoFech(this);
      }
      return this.infoFech;
    }

    public EvtFechaEvPer(Object pai) {
      this.pai = pai;
    }

    @XmlTransient private final Object pai;

    /**
     * Finaliza a população dos campos filhos desse nível
     *
     * @return O nível anterior da árvore
     */
    public T finish() {
      return (T) pai;
    }
    /**
     * Informações do fechamento.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "evtRemun",
          "evtComProd",
          "evtContratAvNP",
          "evtInfoComplPer",
        })
    public static class InfoFech<T> {

      /**
       * Possui informações relativas a remuneração de trabalhadores ou provento/pensão de
       * beneficiários no período de apuração?
       */
      private String evtRemun;

      /** Possui informações de comercialização de produção? */
      private String evtComProd;

      /**
       * Contratou, por intermédio de sindicato, serviços de trabalhadores avulsos não portuários?
       */
      private String evtContratAvNP;

      /**
       * Possui informações de desoneração de folha de pagamento ou, sendo empresa enquadrada no
       * Simples, possui informações sobre a receita obtida em atividades cuja contribuição
       * previdenciária incidente sobre a folha de pagamento é concomitantemente substituída e não
       * substituída?
       */
      private String evtInfoComplPer;

      /**
       * Possui informações relativas a remuneração de trabalhadores ou provento/pensão de
       * beneficiários no período de apuração?
       *
       * @return Conteúdo do campo evtRemun
       */
      public String getEvtRemun() {
        return this.evtRemun;
      }

      /**
       * Possui informações relativas a remuneração de trabalhadores ou provento/pensão de
       * beneficiários no período de apuração?
       *
       * <p>Validação: Se for igual a [S], deve existir evento de remuneração (S-1200, S-1202,
       * S-1207, S-2299 ou S-2399) para o período de apuração. Caso contrário, não deve existir
       * evento de remuneração.
       *
       * @param evtRemun Valor para atribuir ao campo evtRemun
       * @return O próprio InfoFech para continuar populando outros campos
       */
      public InfoFech<T> setEvtRemun(String evtRemun) {
        if (!"S".equals(evtRemun) && !"N".equals(evtRemun))
          throw new RuntimeException(
              "Valor " + String.valueOf(evtRemun) + " inválido para o campo evtRemun");
        this.evtRemun = evtRemun;
        return this;
      }
      /**
       * Sim
       *
       * @return O próprio InfoFech para continuar populando outros campos
       */
      public InfoFech<T> setEvtRemun_S() {
        this.evtRemun = "S";
        return this;
      }
      /**
       * Não
       *
       * @return O próprio InfoFech para continuar populando outros campos
       */
      public InfoFech<T> setEvtRemun_N() {
        this.evtRemun = "N";
        return this;
      }

      /**
       * Possui informações de comercialização de produção?
       *
       * @return Conteúdo do campo evtComProd
       */
      public String getEvtComProd() {
        return this.evtComProd;
      }

      /**
       * Possui informações de comercialização de produção?
       *
       * <p>Validação: Se for igual a [S], deve existir o evento S-1260 para o período de apuração.
       * Caso contrário, não deve existir o evento.
       *
       * @param evtComProd Valor para atribuir ao campo evtComProd
       * @return O próprio InfoFech para continuar populando outros campos
       */
      public InfoFech<T> setEvtComProd(String evtComProd) {
        if (!"S".equals(evtComProd) && !"N".equals(evtComProd))
          throw new RuntimeException(
              "Valor " + String.valueOf(evtComProd) + " inválido para o campo evtComProd");
        this.evtComProd = evtComProd;
        return this;
      }
      /**
       * Sim
       *
       * @return O próprio InfoFech para continuar populando outros campos
       */
      public InfoFech<T> setEvtComProd_S() {
        this.evtComProd = "S";
        return this;
      }
      /**
       * Não
       *
       * @return O próprio InfoFech para continuar populando outros campos
       */
      public InfoFech<T> setEvtComProd_N() {
        this.evtComProd = "N";
        return this;
      }

      /**
       * Contratou, por intermédio de sindicato, serviços de trabalhadores avulsos não portuários?
       *
       * @return Conteúdo do campo evtContratAvNP
       */
      public String getEvtContratAvNP() {
        return this.evtContratAvNP;
      }

      /**
       * Contratou, por intermédio de sindicato, serviços de trabalhadores avulsos não portuários?
       *
       * <p>Validação: Se for igual a [S], deve existir o evento S-1270 para o período de apuração.
       * Caso contrário, não deve existir o evento.
       *
       * @param evtContratAvNP Valor para atribuir ao campo evtContratAvNP
       * @return O próprio InfoFech para continuar populando outros campos
       */
      public InfoFech<T> setEvtContratAvNP(String evtContratAvNP) {
        if (!"S".equals(evtContratAvNP) && !"N".equals(evtContratAvNP))
          throw new RuntimeException(
              "Valor " + String.valueOf(evtContratAvNP) + " inválido para o campo evtContratAvNP");
        this.evtContratAvNP = evtContratAvNP;
        return this;
      }
      /**
       * Sim
       *
       * @return O próprio InfoFech para continuar populando outros campos
       */
      public InfoFech<T> setEvtContratAvNP_S() {
        this.evtContratAvNP = "S";
        return this;
      }
      /**
       * Não
       *
       * @return O próprio InfoFech para continuar populando outros campos
       */
      public InfoFech<T> setEvtContratAvNP_N() {
        this.evtContratAvNP = "N";
        return this;
      }

      /**
       * Possui informações de desoneração de folha de pagamento ou, sendo empresa enquadrada no
       * Simples, possui informações sobre a receita obtida em atividades cuja contribuição
       * previdenciária incidente sobre a folha de pagamento é concomitantemente substituída e não
       * substituída?
       *
       * @return Conteúdo do campo evtInfoComplPer
       */
      public String getEvtInfoComplPer() {
        return this.evtInfoComplPer;
      }

      /**
       * Possui informações de desoneração de folha de pagamento ou, sendo empresa enquadrada no
       * Simples, possui informações sobre a receita obtida em atividades cuja contribuição
       * previdenciária incidente sobre a folha de pagamento é concomitantemente substituída e não
       * substituída?
       *
       * <p>Validação: Se for igual a [S], deve existir o evento S-1280 para o período de apuração.
       * Caso contrário, não deve existir o evento.
       *
       * @param evtInfoComplPer Valor para atribuir ao campo evtInfoComplPer
       * @return O próprio InfoFech para continuar populando outros campos
       */
      public InfoFech<T> setEvtInfoComplPer(String evtInfoComplPer) {
        if (!"S".equals(evtInfoComplPer) && !"N".equals(evtInfoComplPer))
          throw new RuntimeException(
              "Valor "
                  + String.valueOf(evtInfoComplPer)
                  + " inválido para o campo evtInfoComplPer");
        this.evtInfoComplPer = evtInfoComplPer;
        return this;
      }
      /**
       * Sim
       *
       * @return O próprio InfoFech para continuar populando outros campos
       */
      public InfoFech<T> setEvtInfoComplPer_S() {
        this.evtInfoComplPer = "S";
        return this;
      }
      /**
       * Não
       *
       * @return O próprio InfoFech para continuar populando outros campos
       */
      public InfoFech<T> setEvtInfoComplPer_N() {
        this.evtInfoComplPer = "N";
        return this;
      }

      public InfoFech(Object pai) {
        this.pai = pai;
      }

      @XmlTransient private final Object pai;

      /**
       * Finaliza a população dos campos filhos desse nível
       *
       * @return O nível anterior da árvore
       */
      public T finish() {
        return (T) pai;
      }
    }
  }
}
