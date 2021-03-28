package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-2298 - Reintegração/Outros Provimentos */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtReintegr",
    })
@XmlRootElement(name = "eSocial")
public class Evento_Reintegr {

  /** Evento Reintegração/Outros Provimentos. */
  private EvtReintegr evtReintegr;

  /**
   * Evento Reintegração/Outros Provimentos.
   *
   * @return Conteúdo do campo evtReintegr
   */
  public EvtReintegr getEvtReintegr() {
    return this.evtReintegr;
  }

  /**
   * Evento Reintegração/Outros Provimentos.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_EMPREGADO_DOMESTICO
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EVENTOS_EXTEMP
   *
   * <p>REGRA:REGRA_EVENTO_IMPACTO_FOPAG
   *
   * <p>REGRA:REGRA_EXISTE_EVENTO_DESLIGAMENTO
   *
   * <p>REGRA:REGRA_EXISTE_INFO_EMPREGADOR
   *
   * <p>REGRA:REGRA_EXTEMP_REINTEGRACAO
   *
   * <p>REGRA:REGRA_MESMO_PROCEMI
   *
   * <p>REGRA:REGRA_REINTEG_EXCLUSAO_EVENTO
   *
   * <p>REGRA:REGRA_RETIFICA_MESMO_VINCULO
   *
   * <p>REGRA:REGRA_VALIDA_EMPREGADOR
   *
   * @return O objeto EvtReintegr para população dos campos filhos
   */
  public EvtReintegr<Evento_Reintegr> setEvtReintegr() {
    if (this.evtReintegr == null) {
      this.evtReintegr = new EvtReintegr(this);
    }
    return this.evtReintegr;
  }

  /**
   * Evento Reintegração/Outros Provimentos.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "ideVinculo",
        "infoReintegr",
      })
  public static class EvtReintegr<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_trab ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /** Informações de identificação do trabalhador e do vínculo. */
    private Tipos.T_ideVinculo ideVinculo;

    /** Informações da reintegração. */
    private InfoReintegr infoReintegr;

    /**
     * Informações de identificação do evento.
     *
     * @return Conteúdo do campo ideEvento
     */
    public Tipos.T_ideEvento_trab getIdeEvento() {
      return this.ideEvento;
    }

    /**
     * Informações de identificação do evento.
     *
     * @return O objeto Tipos.T_ideEvento_trab para população dos campos filhos
     */
    public Tipos.T_ideEvento_trab<EvtReintegr<T>> setIdeEvento() {
      if (this.ideEvento == null) {
        this.ideEvento = new Tipos.T_ideEvento_trab(this);
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
    public Tipos.T_ideEmpregador<EvtReintegr<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Informações de identificação do trabalhador e do vínculo.
     *
     * @return Conteúdo do campo ideVinculo
     */
    public Tipos.T_ideVinculo getIdeVinculo() {
      return this.ideVinculo;
    }

    /**
     * Informações de identificação do trabalhador e do vínculo.
     *
     * <p>CHAVE_GRUPO: {cpfTrab}, {matricula}
     *
     * @return O objeto Tipos.T_ideVinculo para população dos campos filhos
     */
    public Tipos.T_ideVinculo<EvtReintegr<T>> setIdeVinculo() {
      if (this.ideVinculo == null) {
        this.ideVinculo = new Tipos.T_ideVinculo(this);
      }
      return this.ideVinculo;
    }

    /**
     * Informações da reintegração.
     *
     * @return Conteúdo do campo infoReintegr
     */
    public InfoReintegr getInfoReintegr() {
      return this.infoReintegr;
    }

    /**
     * Informações da reintegração.
     *
     * <p>CHAVE_GRUPO: {dtEfetRetorno}
     *
     * @return O objeto InfoReintegr para população dos campos filhos
     */
    public InfoReintegr<EvtReintegr<T>> setInfoReintegr() {
      if (this.infoReintegr == null) {
        this.infoReintegr = new InfoReintegr(this);
      }
      return this.infoReintegr;
    }

    public EvtReintegr(Object pai) {
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
     * Informações da reintegração.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "tpReint",
          "nrProcJud",
          "nrLeiAnistia",
          "dtEfetRetorno",
          "dtEfeito",
        })
    public static class InfoReintegr<T> {

      /** Tipo de reintegração/outro provimento. */
      private String tpReint;

      /** Em caso de reintegração por determinação judicial, preencher com o número do processo. */
      private String nrProcJud;

      /** Informar a lei de anistia, descrevendo seu número e ano de publicação. */
      private String nrLeiAnistia;

      /** Informar a data do efetivo retorno ao trabalho. */
      private javax.xml.datatype.XMLGregorianCalendar dtEfetRetorno;

      /** Informar a data de início dos efeitos financeiros da reintegração. */
      private javax.xml.datatype.XMLGregorianCalendar dtEfeito;

      /**
       * Tipo de reintegração/outro provimento.
       *
       * @return Conteúdo do campo tpReint
       */
      public String getTpReint() {
        return this.tpReint;
      }

      /**
       * Tipo de reintegração/outro provimento.
       *
       * <p>Validação: Os tipos [3, 4, 5] só podem ser informados se a natureza jurídica do
       * declarante for Administração Pública (grupo [1]).
       *
       * @param tpReint Valor para atribuir ao campo tpReint
       * @return O próprio InfoReintegr para continuar populando outros campos
       */
      public InfoReintegr<T> setTpReint(String tpReint) {
        if (!"1".equals(tpReint)
            && !"2".equals(tpReint)
            && !"3".equals(tpReint)
            && !"4".equals(tpReint)
            && !"5".equals(tpReint)
            && !"9".equals(tpReint))
          throw new RuntimeException(
              "Valor " + String.valueOf(tpReint) + " inválido para o campo tpReint");
        this.tpReint = tpReint;
        return this;
      }
      /**
       * Reintegração por decisão judicial
       *
       * @return O próprio InfoReintegr para continuar populando outros campos
       */
      public InfoReintegr<T> setTpReint_1() {
        this.tpReint = "1";
        return this;
      }
      /**
       * Reintegração por anistia legal
       *
       * @return O próprio InfoReintegr para continuar populando outros campos
       */
      public InfoReintegr<T> setTpReint_2() {
        this.tpReint = "2";
        return this;
      }
      /**
       * Reversão de servidor público
       *
       * @return O próprio InfoReintegr para continuar populando outros campos
       */
      public InfoReintegr<T> setTpReint_3() {
        this.tpReint = "3";
        return this;
      }
      /**
       * Recondução de servidor público
       *
       * @return O próprio InfoReintegr para continuar populando outros campos
       */
      public InfoReintegr<T> setTpReint_4() {
        this.tpReint = "4";
        return this;
      }
      /**
       * Reinclusão de militar
       *
       * @return O próprio InfoReintegr para continuar populando outros campos
       */
      public InfoReintegr<T> setTpReint_5() {
        this.tpReint = "5";
        return this;
      }
      /**
       * Outros
       *
       * @return O próprio InfoReintegr para continuar populando outros campos
       */
      public InfoReintegr<T> setTpReint_9() {
        this.tpReint = "9";
        return this;
      }

      /**
       * Em caso de reintegração por determinação judicial, preencher com o número do processo.
       *
       * @return Conteúdo do campo nrProcJud
       */
      public String getNrProcJud() {
        return this.nrProcJud;
      }

      /**
       * Em caso de reintegração por determinação judicial, preencher com o número do processo.
       *
       * <p>Validação: Informação obrigatória e exclusiva se {tpReint}(./tpReint) = [1].
       *
       * <p>Se preenchido, deve ser um processo judicial válido, com 20 (vinte) algarismos.
       *
       * @param nrProcJud Valor para atribuir ao campo nrProcJud
       * @return O próprio InfoReintegr para continuar populando outros campos
       */
      public InfoReintegr<T> setNrProcJud(String nrProcJud) {
        this.nrProcJud = nrProcJud;
        return this;
      }

      /**
       * Informar a lei de anistia, descrevendo seu número e ano de publicação.
       *
       * @return Conteúdo do campo nrLeiAnistia
       */
      public String getNrLeiAnistia() {
        return this.nrLeiAnistia;
      }

      /**
       * Informar a lei de anistia, descrevendo seu número e ano de publicação.
       *
       * <p>Validação: Preenchimento obrigatório se {tpReint}(./tpReint) = [2].
       *
       * @param nrLeiAnistia Valor para atribuir ao campo nrLeiAnistia
       * @return O próprio InfoReintegr para continuar populando outros campos
       */
      public InfoReintegr<T> setNrLeiAnistia(String nrLeiAnistia) {
        this.nrLeiAnistia = nrLeiAnistia;
        return this;
      }

      /**
       * Informar a data do efetivo retorno ao trabalho.
       *
       * @return Conteúdo do campo dtEfetRetorno
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtEfetRetorno() {
        return this.dtEfetRetorno;
      }

      /**
       * Informar a data do efetivo retorno ao trabalho.
       *
       * <p>Validação: Deve ser uma data válida, posterior à data de desligamento do trabalhador.
       * Não pode ser posterior a 30 (trinta) dias da data atual.
       *
       * @param dtEfetRetorno Valor para atribuir ao campo dtEfetRetorno
       * @return O próprio InfoReintegr para continuar populando outros campos
       */
      public InfoReintegr<T> setDtEfetRetorno(
          javax.xml.datatype.XMLGregorianCalendar dtEfetRetorno) {
        this.dtEfetRetorno = dtEfetRetorno;
        return this;
      }

      /**
       * Informar a data de início dos efeitos financeiros da reintegração.
       *
       * @return Conteúdo do campo dtEfeito
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtEfeito() {
        return this.dtEfeito;
      }

      /**
       * Informar a data de início dos efeitos financeiros da reintegração.
       *
       * <p>Validação: Deve ser uma data igual ou anterior à data do efetivo retorno ao trabalho e
       * posterior à data do desligamento.
       *
       * @param dtEfeito Valor para atribuir ao campo dtEfeito
       * @return O próprio InfoReintegr para continuar populando outros campos
       */
      public InfoReintegr<T> setDtEfeito(javax.xml.datatype.XMLGregorianCalendar dtEfeito) {
        this.dtEfeito = dtEfeito;
        return this;
      }

      public InfoReintegr(Object pai) {
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
