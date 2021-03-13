package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {})
public class Tipos {

  /**
   * Informações de identificação do evento.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "tpAmb", "procEmi", "verProc",
      })
  public static class T_ideEvento_evtTab<T> {

    /** Identificação do ambiente. */
    private String tpAmb;

    /** Processo de emissão do evento. */
    private String procEmi;

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     */
    private String verProc;

    /**
     * Identificação do ambiente.
     *
     * @return Valor do campo tpAmb
     */
    public String getTpAmb() {
      return this.tpAmb;
    }

    /**
     * Identificação do ambiente.
     *
     * @param tpAmb Valor para atribuir ao campo tpAmb
     * @return O próprio T_ideEvento_evtTab para continuar populando outros campos
     */
    public T_ideEvento_evtTab<T> setTpAmb(String tpAmb) {
      this.tpAmb = tpAmb;
      return this;
    }

    /**
     * Processo de emissão do evento.
     *
     * @return Valor do campo procEmi
     */
    public String getProcEmi() {
      return this.procEmi;
    }

    /**
     * Processo de emissão do evento.
     *
     * @param procEmi Valor para atribuir ao campo procEmi
     * @return O próprio T_ideEvento_evtTab para continuar populando outros campos
     */
    public T_ideEvento_evtTab<T> setProcEmi(String procEmi) {
      this.procEmi = procEmi;
      return this;
    }

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     *
     * @return Valor do campo verProc
     */
    public String getVerProc() {
      return this.verProc;
    }

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     *
     * @param verProc Valor para atribuir ao campo verProc
     * @return O próprio T_ideEvento_evtTab para continuar populando outros campos
     */
    public T_ideEvento_evtTab<T> setVerProc(String verProc) {
      this.verProc = verProc;
      return this;
    }

    public T_ideEvento_evtTab(Object pai) {
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

  /**
   * Informações de identificação do evento.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "indRetif",
        "nrRecibo",
        "indApuracao",
        "perApur",
        "indGuia",
        "tpAmb",
        "procEmi",
        "verProc",
      })
  public static class T_ideEvento_folha<T> {

    /** Informe [1] para arquivo original ou [2] para arquivo de retificação. */
    private String indRetif;

    /** Preencher com o número do recibo do arquivo a ser retificado. */
    private String nrRecibo;

    /** Indicativo de período de apuração. */
    private String indApuracao;

    /**
     * Informar o mês/ano (formato AAAA-MM) de referência das informações, se
     * {indApuracao}(./indApuracao) for igual a [1], ou apenas o ano (formato AAAA), se
     * {indApuracao}(./indApuracao) for igual a [2].
     */
    private String perApur;

    /** Indicativo do tipo de guia. */
    private String indGuia;

    /** Identificação do ambiente. */
    private String tpAmb;

    /** Processo de emissão do evento. */
    private String procEmi;

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     */
    private String verProc;

    /**
     * Informe [1] para arquivo original ou [2] para arquivo de retificação.
     *
     * @return Valor do campo indRetif
     */
    public String getIndRetif() {
      return this.indRetif;
    }

    /**
     * Informe [1] para arquivo original ou [2] para arquivo de retificação.
     *
     * @param indRetif Valor para atribuir ao campo indRetif
     * @return O próprio T_ideEvento_folha para continuar populando outros campos
     */
    public T_ideEvento_folha<T> setIndRetif(String indRetif) {
      this.indRetif = indRetif;
      return this;
    }

    /**
     * Preencher com o número do recibo do arquivo a ser retificado.
     *
     * @return Valor do campo nrRecibo
     */
    public String getNrRecibo() {
      return this.nrRecibo;
    }

    /**
     * Preencher com o número do recibo do arquivo a ser retificado.
     *
     * <p>Validação: O preenchimento é obrigatório se {indRetif}(./indRetif) = [2].
     *
     * <p>Deve ser um recibo de entrega válido, correspondente ao arquivo que está sendo retificado.
     *
     * @param nrRecibo Valor para atribuir ao campo nrRecibo
     * @return O próprio T_ideEvento_folha para continuar populando outros campos
     */
    public T_ideEvento_folha<T> setNrRecibo(String nrRecibo) {
      this.nrRecibo = nrRecibo;
      return this;
    }

    /**
     * Indicativo de período de apuração.
     *
     * @return Valor do campo indApuracao
     */
    public String getIndApuracao() {
      return this.indApuracao;
    }

    /**
     * Indicativo de período de apuração.
     *
     * @param indApuracao Valor para atribuir ao campo indApuracao
     * @return O próprio T_ideEvento_folha para continuar populando outros campos
     */
    public T_ideEvento_folha<T> setIndApuracao(String indApuracao) {
      this.indApuracao = indApuracao;
      return this;
    }

    /**
     * Informar o mês/ano (formato AAAA-MM) de referência das informações, se
     * {indApuracao}(./indApuracao) for igual a [1], ou apenas o ano (formato AAAA), se
     * {indApuracao}(./indApuracao) for igual a [2].
     *
     * @return Valor do campo perApur
     */
    public String getPerApur() {
      return this.perApur;
    }

    /**
     * Informar o mês/ano (formato AAAA-MM) de referência das informações, se
     * {indApuracao}(./indApuracao) for igual a [1], ou apenas o ano (formato AAAA), se
     * {indApuracao}(./indApuracao) for igual a [2].
     *
     * <p>Validação: Deve ser um mês/ano ou ano válido, igual ou posterior ao início da
     * obrigatoriedade dos eventos periódicos para o empregador.
     *
     * @param perApur Valor para atribuir ao campo perApur
     * @return O próprio T_ideEvento_folha para continuar populando outros campos
     */
    public T_ideEvento_folha<T> setPerApur(String perApur) {
      this.perApur = perApur;
      return this;
    }

    /**
     * Indicativo do tipo de guia.
     *
     * @return Valor do campo indGuia
     */
    public String getIndGuia() {
      return this.indGuia;
    }

    /**
     * Indicativo do tipo de guia.
     *
     * @param indGuia Valor para atribuir ao campo indGuia
     * @return O próprio T_ideEvento_folha para continuar populando outros campos
     */
    public T_ideEvento_folha<T> setIndGuia(String indGuia) {
      this.indGuia = indGuia;
      return this;
    }

    /**
     * Identificação do ambiente.
     *
     * @return Valor do campo tpAmb
     */
    public String getTpAmb() {
      return this.tpAmb;
    }

    /**
     * Identificação do ambiente.
     *
     * @param tpAmb Valor para atribuir ao campo tpAmb
     * @return O próprio T_ideEvento_folha para continuar populando outros campos
     */
    public T_ideEvento_folha<T> setTpAmb(String tpAmb) {
      this.tpAmb = tpAmb;
      return this;
    }

    /**
     * Processo de emissão do evento.
     *
     * @return Valor do campo procEmi
     */
    public String getProcEmi() {
      return this.procEmi;
    }

    /**
     * Processo de emissão do evento.
     *
     * @param procEmi Valor para atribuir ao campo procEmi
     * @return O próprio T_ideEvento_folha para continuar populando outros campos
     */
    public T_ideEvento_folha<T> setProcEmi(String procEmi) {
      this.procEmi = procEmi;
      return this;
    }

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     *
     * @return Valor do campo verProc
     */
    public String getVerProc() {
      return this.verProc;
    }

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     *
     * @param verProc Valor para atribuir ao campo verProc
     * @return O próprio T_ideEvento_folha para continuar populando outros campos
     */
    public T_ideEvento_folha<T> setVerProc(String verProc) {
      this.verProc = verProc;
      return this;
    }

    public T_ideEvento_folha(Object pai) {
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

  /**
   * Informações de identificação do evento.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "indRetif",
        "nrRecibo",
        "indApuracao",
        "perApur",
        "tpAmb",
        "procEmi",
        "verProc",
      })
  public static class T_ideEvento_folha_opp<T> {

    /** Informe [1] para arquivo original ou [2] para arquivo de retificação. */
    private String indRetif;

    /** Preencher com o número do recibo do arquivo a ser retificado. */
    private String nrRecibo;

    /** Indicativo de período de apuração. */
    private String indApuracao;

    /**
     * Informar o mês/ano (formato AAAA-MM) de referência das informações, se
     * {indApuracao}(./indApuracao) for igual a [1], ou apenas o ano (formato AAAA), se
     * {indApuracao}(./indApuracao) for igual a [2].
     */
    private String perApur;

    /** Identificação do ambiente. */
    private String tpAmb;

    /** Processo de emissão do evento. */
    private String procEmi;

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     */
    private String verProc;

    /**
     * Informe [1] para arquivo original ou [2] para arquivo de retificação.
     *
     * @return Valor do campo indRetif
     */
    public String getIndRetif() {
      return this.indRetif;
    }

    /**
     * Informe [1] para arquivo original ou [2] para arquivo de retificação.
     *
     * @param indRetif Valor para atribuir ao campo indRetif
     * @return O próprio T_ideEvento_folha_opp para continuar populando outros campos
     */
    public T_ideEvento_folha_opp<T> setIndRetif(String indRetif) {
      this.indRetif = indRetif;
      return this;
    }

    /**
     * Preencher com o número do recibo do arquivo a ser retificado.
     *
     * @return Valor do campo nrRecibo
     */
    public String getNrRecibo() {
      return this.nrRecibo;
    }

    /**
     * Preencher com o número do recibo do arquivo a ser retificado.
     *
     * <p>Validação: O preenchimento é obrigatório se {indRetif}(./indRetif) = [2].
     *
     * <p>Deve ser um recibo de entrega válido, correspondente ao arquivo que está sendo retificado.
     *
     * @param nrRecibo Valor para atribuir ao campo nrRecibo
     * @return O próprio T_ideEvento_folha_opp para continuar populando outros campos
     */
    public T_ideEvento_folha_opp<T> setNrRecibo(String nrRecibo) {
      this.nrRecibo = nrRecibo;
      return this;
    }

    /**
     * Indicativo de período de apuração.
     *
     * @return Valor do campo indApuracao
     */
    public String getIndApuracao() {
      return this.indApuracao;
    }

    /**
     * Indicativo de período de apuração.
     *
     * @param indApuracao Valor para atribuir ao campo indApuracao
     * @return O próprio T_ideEvento_folha_opp para continuar populando outros campos
     */
    public T_ideEvento_folha_opp<T> setIndApuracao(String indApuracao) {
      this.indApuracao = indApuracao;
      return this;
    }

    /**
     * Informar o mês/ano (formato AAAA-MM) de referência das informações, se
     * {indApuracao}(./indApuracao) for igual a [1], ou apenas o ano (formato AAAA), se
     * {indApuracao}(./indApuracao) for igual a [2].
     *
     * @return Valor do campo perApur
     */
    public String getPerApur() {
      return this.perApur;
    }

    /**
     * Informar o mês/ano (formato AAAA-MM) de referência das informações, se
     * {indApuracao}(./indApuracao) for igual a [1], ou apenas o ano (formato AAAA), se
     * {indApuracao}(./indApuracao) for igual a [2].
     *
     * <p>Validação: Deve ser um mês/ano ou ano válido, igual ou posterior ao início da
     * obrigatoriedade dos eventos periódicos para o empregador.
     *
     * @param perApur Valor para atribuir ao campo perApur
     * @return O próprio T_ideEvento_folha_opp para continuar populando outros campos
     */
    public T_ideEvento_folha_opp<T> setPerApur(String perApur) {
      this.perApur = perApur;
      return this;
    }

    /**
     * Identificação do ambiente.
     *
     * @return Valor do campo tpAmb
     */
    public String getTpAmb() {
      return this.tpAmb;
    }

    /**
     * Identificação do ambiente.
     *
     * @param tpAmb Valor para atribuir ao campo tpAmb
     * @return O próprio T_ideEvento_folha_opp para continuar populando outros campos
     */
    public T_ideEvento_folha_opp<T> setTpAmb(String tpAmb) {
      this.tpAmb = tpAmb;
      return this;
    }

    /**
     * Processo de emissão do evento.
     *
     * @return Valor do campo procEmi
     */
    public String getProcEmi() {
      return this.procEmi;
    }

    /**
     * Processo de emissão do evento.
     *
     * @param procEmi Valor para atribuir ao campo procEmi
     * @return O próprio T_ideEvento_folha_opp para continuar populando outros campos
     */
    public T_ideEvento_folha_opp<T> setProcEmi(String procEmi) {
      this.procEmi = procEmi;
      return this;
    }

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     *
     * @return Valor do campo verProc
     */
    public String getVerProc() {
      return this.verProc;
    }

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     *
     * @param verProc Valor para atribuir ao campo verProc
     * @return O próprio T_ideEvento_folha_opp para continuar populando outros campos
     */
    public T_ideEvento_folha_opp<T> setVerProc(String verProc) {
      this.verProc = verProc;
      return this;
    }

    public T_ideEvento_folha_opp(Object pai) {
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

  /**
   * Informações de identificação do evento.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "indRetif",
        "nrRecibo",
        "perApur",
        "indGuia",
        "tpAmb",
        "procEmi",
        "verProc",
      })
  public static class T_ideEvento_folha_mensal<T> {

    /** Informe [1] para arquivo original ou [2] para arquivo de retificação. */
    private String indRetif;

    /** Preencher com o número do recibo do arquivo a ser retificado. */
    private String nrRecibo;

    /** Informar o mês/ano (formato AAAA-MM) de referência das informações. */
    private String perApur;

    /** Indicativo do tipo de guia. */
    private String indGuia;

    /** Identificação do ambiente. */
    private String tpAmb;

    /** Processo de emissão do evento. */
    private String procEmi;

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     */
    private String verProc;

    /**
     * Informe [1] para arquivo original ou [2] para arquivo de retificação.
     *
     * @return Valor do campo indRetif
     */
    public String getIndRetif() {
      return this.indRetif;
    }

    /**
     * Informe [1] para arquivo original ou [2] para arquivo de retificação.
     *
     * @param indRetif Valor para atribuir ao campo indRetif
     * @return O próprio T_ideEvento_folha_mensal para continuar populando outros campos
     */
    public T_ideEvento_folha_mensal<T> setIndRetif(String indRetif) {
      this.indRetif = indRetif;
      return this;
    }

    /**
     * Preencher com o número do recibo do arquivo a ser retificado.
     *
     * @return Valor do campo nrRecibo
     */
    public String getNrRecibo() {
      return this.nrRecibo;
    }

    /**
     * Preencher com o número do recibo do arquivo a ser retificado.
     *
     * <p>Validação: O preenchimento é obrigatório se {indRetif}(./indRetif) = [2].
     *
     * <p>Deve ser um recibo de entrega válido, correspondente ao arquivo que está sendo retificado.
     *
     * @param nrRecibo Valor para atribuir ao campo nrRecibo
     * @return O próprio T_ideEvento_folha_mensal para continuar populando outros campos
     */
    public T_ideEvento_folha_mensal<T> setNrRecibo(String nrRecibo) {
      this.nrRecibo = nrRecibo;
      return this;
    }

    /**
     * Informar o mês/ano (formato AAAA-MM) de referência das informações.
     *
     * @return Valor do campo perApur
     */
    public String getPerApur() {
      return this.perApur;
    }

    /**
     * Informar o mês/ano (formato AAAA-MM) de referência das informações.
     *
     * <p>Validação: Deve ser um mês/ano válido, igual ou posterior ao início da obrigatoriedade dos
     * eventos periódicos para o empregador.
     *
     * @param perApur Valor para atribuir ao campo perApur
     * @return O próprio T_ideEvento_folha_mensal para continuar populando outros campos
     */
    public T_ideEvento_folha_mensal<T> setPerApur(String perApur) {
      this.perApur = perApur;
      return this;
    }

    /**
     * Indicativo do tipo de guia.
     *
     * @return Valor do campo indGuia
     */
    public String getIndGuia() {
      return this.indGuia;
    }

    /**
     * Indicativo do tipo de guia.
     *
     * @param indGuia Valor para atribuir ao campo indGuia
     * @return O próprio T_ideEvento_folha_mensal para continuar populando outros campos
     */
    public T_ideEvento_folha_mensal<T> setIndGuia(String indGuia) {
      this.indGuia = indGuia;
      return this;
    }

    /**
     * Identificação do ambiente.
     *
     * @return Valor do campo tpAmb
     */
    public String getTpAmb() {
      return this.tpAmb;
    }

    /**
     * Identificação do ambiente.
     *
     * @param tpAmb Valor para atribuir ao campo tpAmb
     * @return O próprio T_ideEvento_folha_mensal para continuar populando outros campos
     */
    public T_ideEvento_folha_mensal<T> setTpAmb(String tpAmb) {
      this.tpAmb = tpAmb;
      return this;
    }

    /**
     * Processo de emissão do evento.
     *
     * @return Valor do campo procEmi
     */
    public String getProcEmi() {
      return this.procEmi;
    }

    /**
     * Processo de emissão do evento.
     *
     * @param procEmi Valor para atribuir ao campo procEmi
     * @return O próprio T_ideEvento_folha_mensal para continuar populando outros campos
     */
    public T_ideEvento_folha_mensal<T> setProcEmi(String procEmi) {
      this.procEmi = procEmi;
      return this;
    }

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     *
     * @return Valor do campo verProc
     */
    public String getVerProc() {
      return this.verProc;
    }

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     *
     * @param verProc Valor para atribuir ao campo verProc
     * @return O próprio T_ideEvento_folha_mensal para continuar populando outros campos
     */
    public T_ideEvento_folha_mensal<T> setVerProc(String verProc) {
      this.verProc = verProc;
      return this;
    }

    public T_ideEvento_folha_mensal(Object pai) {
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

  /**
   * Informações de identificação do evento.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "indApuracao",
        "perApur",
        "indGuia",
        "tpAmb",
        "procEmi",
        "verProc",
      })
  public static class T_ideEvento_folha_sem_retificacao<T> {

    /** Indicativo de período de apuração. */
    private String indApuracao;

    /**
     * Informar o mês/ano (formato AAAA-MM) de referência das informações, se
     * {indApuracao}(./indApuracao) for igual a [1], ou apenas o ano (formato AAAA), se
     * {indApuracao}(./indApuracao) for igual a [2].
     */
    private String perApur;

    /** Indicativo do tipo de guia. */
    private String indGuia;

    /** Identificação do ambiente. */
    private String tpAmb;

    /** Processo de emissão do evento. */
    private String procEmi;

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     */
    private String verProc;

    /**
     * Indicativo de período de apuração.
     *
     * @return Valor do campo indApuracao
     */
    public String getIndApuracao() {
      return this.indApuracao;
    }

    /**
     * Indicativo de período de apuração.
     *
     * @param indApuracao Valor para atribuir ao campo indApuracao
     * @return O próprio T_ideEvento_folha_sem_retificacao para continuar populando outros campos
     */
    public T_ideEvento_folha_sem_retificacao<T> setIndApuracao(String indApuracao) {
      this.indApuracao = indApuracao;
      return this;
    }

    /**
     * Informar o mês/ano (formato AAAA-MM) de referência das informações, se
     * {indApuracao}(./indApuracao) for igual a [1], ou apenas o ano (formato AAAA), se
     * {indApuracao}(./indApuracao) for igual a [2].
     *
     * @return Valor do campo perApur
     */
    public String getPerApur() {
      return this.perApur;
    }

    /**
     * Informar o mês/ano (formato AAAA-MM) de referência das informações, se
     * {indApuracao}(./indApuracao) for igual a [1], ou apenas o ano (formato AAAA), se
     * {indApuracao}(./indApuracao) for igual a [2].
     *
     * <p>Validação: Deve ser um mês/ano ou ano válido, igual ou posterior ao início da
     * obrigatoriedade dos eventos periódicos para o empregador.
     *
     * @param perApur Valor para atribuir ao campo perApur
     * @return O próprio T_ideEvento_folha_sem_retificacao para continuar populando outros campos
     */
    public T_ideEvento_folha_sem_retificacao<T> setPerApur(String perApur) {
      this.perApur = perApur;
      return this;
    }

    /**
     * Indicativo do tipo de guia.
     *
     * @return Valor do campo indGuia
     */
    public String getIndGuia() {
      return this.indGuia;
    }

    /**
     * Indicativo do tipo de guia.
     *
     * @param indGuia Valor para atribuir ao campo indGuia
     * @return O próprio T_ideEvento_folha_sem_retificacao para continuar populando outros campos
     */
    public T_ideEvento_folha_sem_retificacao<T> setIndGuia(String indGuia) {
      this.indGuia = indGuia;
      return this;
    }

    /**
     * Identificação do ambiente.
     *
     * @return Valor do campo tpAmb
     */
    public String getTpAmb() {
      return this.tpAmb;
    }

    /**
     * Identificação do ambiente.
     *
     * @param tpAmb Valor para atribuir ao campo tpAmb
     * @return O próprio T_ideEvento_folha_sem_retificacao para continuar populando outros campos
     */
    public T_ideEvento_folha_sem_retificacao<T> setTpAmb(String tpAmb) {
      this.tpAmb = tpAmb;
      return this;
    }

    /**
     * Processo de emissão do evento.
     *
     * @return Valor do campo procEmi
     */
    public String getProcEmi() {
      return this.procEmi;
    }

    /**
     * Processo de emissão do evento.
     *
     * @param procEmi Valor para atribuir ao campo procEmi
     * @return O próprio T_ideEvento_folha_sem_retificacao para continuar populando outros campos
     */
    public T_ideEvento_folha_sem_retificacao<T> setProcEmi(String procEmi) {
      this.procEmi = procEmi;
      return this;
    }

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     *
     * @return Valor do campo verProc
     */
    public String getVerProc() {
      return this.verProc;
    }

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     *
     * @param verProc Valor para atribuir ao campo verProc
     * @return O próprio T_ideEvento_folha_sem_retificacao para continuar populando outros campos
     */
    public T_ideEvento_folha_sem_retificacao<T> setVerProc(String verProc) {
      this.verProc = verProc;
      return this;
    }

    public T_ideEvento_folha_sem_retificacao(Object pai) {
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

  /**
   * Informações de identificação do evento.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "indRetif",
        "nrRecibo",
        "tpAmb",
        "procEmi",
        "verProc",
      })
  public static class T_ideEvento_trab<T> {

    /** Informe [1] para arquivo original ou [2] para arquivo de retificação. */
    private String indRetif;

    /** Preencher com o número do recibo do arquivo a ser retificado. */
    private String nrRecibo;

    /** Identificação do ambiente. */
    private String tpAmb;

    /** Processo de emissão do evento. */
    private String procEmi;

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     */
    private String verProc;

    /**
     * Informe [1] para arquivo original ou [2] para arquivo de retificação.
     *
     * @return Valor do campo indRetif
     */
    public String getIndRetif() {
      return this.indRetif;
    }

    /**
     * Informe [1] para arquivo original ou [2] para arquivo de retificação.
     *
     * @param indRetif Valor para atribuir ao campo indRetif
     * @return O próprio T_ideEvento_trab para continuar populando outros campos
     */
    public T_ideEvento_trab<T> setIndRetif(String indRetif) {
      this.indRetif = indRetif;
      return this;
    }

    /**
     * Preencher com o número do recibo do arquivo a ser retificado.
     *
     * @return Valor do campo nrRecibo
     */
    public String getNrRecibo() {
      return this.nrRecibo;
    }

    /**
     * Preencher com o número do recibo do arquivo a ser retificado.
     *
     * <p>Validação: O preenchimento é obrigatório se {indRetif}(./indRetif) = [2].
     *
     * <p>Deve ser um recibo de entrega válido, correspondente ao arquivo que está sendo retificado.
     *
     * @param nrRecibo Valor para atribuir ao campo nrRecibo
     * @return O próprio T_ideEvento_trab para continuar populando outros campos
     */
    public T_ideEvento_trab<T> setNrRecibo(String nrRecibo) {
      this.nrRecibo = nrRecibo;
      return this;
    }

    /**
     * Identificação do ambiente.
     *
     * @return Valor do campo tpAmb
     */
    public String getTpAmb() {
      return this.tpAmb;
    }

    /**
     * Identificação do ambiente.
     *
     * @param tpAmb Valor para atribuir ao campo tpAmb
     * @return O próprio T_ideEvento_trab para continuar populando outros campos
     */
    public T_ideEvento_trab<T> setTpAmb(String tpAmb) {
      this.tpAmb = tpAmb;
      return this;
    }

    /**
     * Processo de emissão do evento.
     *
     * @return Valor do campo procEmi
     */
    public String getProcEmi() {
      return this.procEmi;
    }

    /**
     * Processo de emissão do evento.
     *
     * @param procEmi Valor para atribuir ao campo procEmi
     * @return O próprio T_ideEvento_trab para continuar populando outros campos
     */
    public T_ideEvento_trab<T> setProcEmi(String procEmi) {
      this.procEmi = procEmi;
      return this;
    }

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     *
     * @return Valor do campo verProc
     */
    public String getVerProc() {
      return this.verProc;
    }

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     *
     * @param verProc Valor para atribuir ao campo verProc
     * @return O próprio T_ideEvento_trab para continuar populando outros campos
     */
    public T_ideEvento_trab<T> setVerProc(String verProc) {
      this.verProc = verProc;
      return this;
    }

    public T_ideEvento_trab(Object pai) {
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

  /**
   * Informações de identificação do evento.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "indRetif",
        "nrRecibo",
        "indGuia",
        "tpAmb",
        "procEmi",
        "verProc",
      })
  public static class T_ideEvento_trab_indGuia<T> {

    /** Informe [1] para arquivo original ou [2] para arquivo de retificação. */
    private String indRetif;

    /** Preencher com o número do recibo do arquivo a ser retificado. */
    private String nrRecibo;

    /** Indicativo do tipo de guia. */
    private String indGuia;

    /** Identificação do ambiente. */
    private String tpAmb;

    /** Processo de emissão do evento. */
    private String procEmi;

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     */
    private String verProc;

    /**
     * Informe [1] para arquivo original ou [2] para arquivo de retificação.
     *
     * @return Valor do campo indRetif
     */
    public String getIndRetif() {
      return this.indRetif;
    }

    /**
     * Informe [1] para arquivo original ou [2] para arquivo de retificação.
     *
     * @param indRetif Valor para atribuir ao campo indRetif
     * @return O próprio T_ideEvento_trab_indGuia para continuar populando outros campos
     */
    public T_ideEvento_trab_indGuia<T> setIndRetif(String indRetif) {
      this.indRetif = indRetif;
      return this;
    }

    /**
     * Preencher com o número do recibo do arquivo a ser retificado.
     *
     * @return Valor do campo nrRecibo
     */
    public String getNrRecibo() {
      return this.nrRecibo;
    }

    /**
     * Preencher com o número do recibo do arquivo a ser retificado.
     *
     * <p>Validação: O preenchimento é obrigatório se {indRetif}(./indRetif) = [2].
     *
     * <p>Deve ser um recibo de entrega válido, correspondente ao arquivo que está sendo retificado.
     *
     * @param nrRecibo Valor para atribuir ao campo nrRecibo
     * @return O próprio T_ideEvento_trab_indGuia para continuar populando outros campos
     */
    public T_ideEvento_trab_indGuia<T> setNrRecibo(String nrRecibo) {
      this.nrRecibo = nrRecibo;
      return this;
    }

    /**
     * Indicativo do tipo de guia.
     *
     * @return Valor do campo indGuia
     */
    public String getIndGuia() {
      return this.indGuia;
    }

    /**
     * Indicativo do tipo de guia.
     *
     * @param indGuia Valor para atribuir ao campo indGuia
     * @return O próprio T_ideEvento_trab_indGuia para continuar populando outros campos
     */
    public T_ideEvento_trab_indGuia<T> setIndGuia(String indGuia) {
      this.indGuia = indGuia;
      return this;
    }

    /**
     * Identificação do ambiente.
     *
     * @return Valor do campo tpAmb
     */
    public String getTpAmb() {
      return this.tpAmb;
    }

    /**
     * Identificação do ambiente.
     *
     * @param tpAmb Valor para atribuir ao campo tpAmb
     * @return O próprio T_ideEvento_trab_indGuia para continuar populando outros campos
     */
    public T_ideEvento_trab_indGuia<T> setTpAmb(String tpAmb) {
      this.tpAmb = tpAmb;
      return this;
    }

    /**
     * Processo de emissão do evento.
     *
     * @return Valor do campo procEmi
     */
    public String getProcEmi() {
      return this.procEmi;
    }

    /**
     * Processo de emissão do evento.
     *
     * @param procEmi Valor para atribuir ao campo procEmi
     * @return O próprio T_ideEvento_trab_indGuia para continuar populando outros campos
     */
    public T_ideEvento_trab_indGuia<T> setProcEmi(String procEmi) {
      this.procEmi = procEmi;
      return this;
    }

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     *
     * @return Valor do campo verProc
     */
    public String getVerProc() {
      return this.verProc;
    }

    /**
     * Versão do processo de emissão do evento. Informar a versão do aplicativo emissor do evento.
     *
     * @param verProc Valor para atribuir ao campo verProc
     * @return O próprio T_ideEvento_trab_indGuia para continuar populando outros campos
     */
    public T_ideEvento_trab_indGuia<T> setVerProc(String verProc) {
      this.verProc = verProc;
      return this;
    }

    public T_ideEvento_trab_indGuia(Object pai) {
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

  /**
   * Identificação do evento de retorno.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "nrRecArqBase",
        "indApuracao",
        "perApur",
      })
  public static class T_ideEvento_retorno_trab<T> {

    /**
     * Preencher com o número do recibo do arquivo que deu origem ao presente arquivo de retorno ao
     * empregador.
     */
    private String nrRecArqBase;

    /** Indicativo de período de apuração. */
    private String indApuracao;

    /**
     * Informar o mês/ano (formato AAAA-MM) de referência das informações, se
     * {indApuracao}(./indApuracao) for igual a [1], ou apenas o ano (formato AAAA), se
     * {indApuracao}(./indApuracao) for igual a [2].
     */
    private String perApur;

    /**
     * Preencher com o número do recibo do arquivo que deu origem ao presente arquivo de retorno ao
     * empregador.
     *
     * @return Valor do campo nrRecArqBase
     */
    public String getNrRecArqBase() {
      return this.nrRecArqBase;
    }

    /**
     * Preencher com o número do recibo do arquivo que deu origem ao presente arquivo de retorno ao
     * empregador.
     *
     * <p>Validação: Deve ser um recibo de entrega válido, correspondente ao arquivo que deu origem
     * ao presente arquivo de retorno (S-1200, S-2299, S-2399 ou S-3000).
     *
     * @param nrRecArqBase Valor para atribuir ao campo nrRecArqBase
     * @return O próprio T_ideEvento_retorno_trab para continuar populando outros campos
     */
    public T_ideEvento_retorno_trab<T> setNrRecArqBase(String nrRecArqBase) {
      this.nrRecArqBase = nrRecArqBase;
      return this;
    }

    /**
     * Indicativo de período de apuração.
     *
     * @return Valor do campo indApuracao
     */
    public String getIndApuracao() {
      return this.indApuracao;
    }

    /**
     * Indicativo de período de apuração.
     *
     * @param indApuracao Valor para atribuir ao campo indApuracao
     * @return O próprio T_ideEvento_retorno_trab para continuar populando outros campos
     */
    public T_ideEvento_retorno_trab<T> setIndApuracao(String indApuracao) {
      this.indApuracao = indApuracao;
      return this;
    }

    /**
     * Informar o mês/ano (formato AAAA-MM) de referência das informações, se
     * {indApuracao}(./indApuracao) for igual a [1], ou apenas o ano (formato AAAA), se
     * {indApuracao}(./indApuracao) for igual a [2].
     *
     * @return Valor do campo perApur
     */
    public String getPerApur() {
      return this.perApur;
    }

    /**
     * Informar o mês/ano (formato AAAA-MM) de referência das informações, se
     * {indApuracao}(./indApuracao) for igual a [1], ou apenas o ano (formato AAAA), se
     * {indApuracao}(./indApuracao) for igual a [2].
     *
     * @param perApur Valor para atribuir ao campo perApur
     * @return O próprio T_ideEvento_retorno_trab para continuar populando outros campos
     */
    public T_ideEvento_retorno_trab<T> setPerApur(String perApur) {
      this.perApur = perApur;
      return this;
    }

    public T_ideEvento_retorno_trab(Object pai) {
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

  /**
   * Identificação do evento de retorno.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "indApuracao",
        "perApur",
      })
  public static class T_ideEvento_retorno_contrib<T> {

    /** Indicativo de período de apuração. */
    private String indApuracao;

    /**
     * Informar o mês/ano (formato AAAA-MM) de referência das informações, se
     * {indApuracao}(./indApuracao) for igual a [1], ou apenas o ano (formato AAAA), se
     * {indApuracao}(./indApuracao) for igual a [2].
     */
    private String perApur;

    /**
     * Indicativo de período de apuração.
     *
     * @return Valor do campo indApuracao
     */
    public String getIndApuracao() {
      return this.indApuracao;
    }

    /**
     * Indicativo de período de apuração.
     *
     * @param indApuracao Valor para atribuir ao campo indApuracao
     * @return O próprio T_ideEvento_retorno_contrib para continuar populando outros campos
     */
    public T_ideEvento_retorno_contrib<T> setIndApuracao(String indApuracao) {
      this.indApuracao = indApuracao;
      return this;
    }

    /**
     * Informar o mês/ano (formato AAAA-MM) de referência das informações, se
     * {indApuracao}(./indApuracao) for igual a [1], ou apenas o ano (formato AAAA), se
     * {indApuracao}(./indApuracao) for igual a [2].
     *
     * @return Valor do campo perApur
     */
    public String getPerApur() {
      return this.perApur;
    }

    /**
     * Informar o mês/ano (formato AAAA-MM) de referência das informações, se
     * {indApuracao}(./indApuracao) for igual a [1], ou apenas o ano (formato AAAA), se
     * {indApuracao}(./indApuracao) for igual a [2].
     *
     * @param perApur Valor para atribuir ao campo perApur
     * @return O próprio T_ideEvento_retorno_contrib para continuar populando outros campos
     */
    public T_ideEvento_retorno_contrib<T> setPerApur(String perApur) {
      this.perApur = perApur;
      return this;
    }

    public T_ideEvento_retorno_contrib(Object pai) {
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

  /**
   * Informações de identificação do empregador.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "tpInsc", "nrInsc",
      })
  public static class T_ideEmpregador<T> {

    /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
    private String tpInsc;

    /**
     * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado no
     * campo {ideEmpregador/tpInsc}(./tpInsc) e conforme informado em S-1000.
     */
    private String nrInsc;

    /**
     * Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05.
     *
     * @return Valor do campo tpInsc
     */
    public String getTpInsc() {
      return this.tpInsc;
    }

    /**
     * Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05.
     *
     * @param tpInsc Valor para atribuir ao campo tpInsc
     * @return O próprio T_ideEmpregador para continuar populando outros campos
     */
    public T_ideEmpregador<T> setTpInsc(String tpInsc) {
      this.tpInsc = tpInsc;
      return this;
    }

    /**
     * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado no
     * campo {ideEmpregador/tpInsc}(./tpInsc) e conforme informado em S-1000.
     *
     * @return Valor do campo nrInsc
     */
    public String getNrInsc() {
      return this.nrInsc;
    }

    /**
     * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado no
     * campo {ideEmpregador/tpInsc}(./tpInsc) e conforme informado em S-1000.
     *
     * @param nrInsc Valor para atribuir ao campo nrInsc
     * @return O próprio T_ideEmpregador para continuar populando outros campos
     */
    public T_ideEmpregador<T> setNrInsc(String nrInsc) {
      this.nrInsc = nrInsc;
      return this;
    }

    public T_ideEmpregador(Object pai) {
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

  /**
   * Informações de identificação do empregador.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "tpInsc", "nrInsc",
      })
  public static class T_ideEmpregador_cnpj<T> {

    /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
    private String tpInsc;

    /**
     * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado no
     * campo {ideEmpregador/tpInsc}(./tpInsc) e conforme informado em S-1000.
     */
    private String nrInsc;

    /**
     * Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05.
     *
     * @return Valor do campo tpInsc
     */
    public String getTpInsc() {
      return this.tpInsc;
    }

    /**
     * Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05.
     *
     * @param tpInsc Valor para atribuir ao campo tpInsc
     * @return O próprio T_ideEmpregador_cnpj para continuar populando outros campos
     */
    public T_ideEmpregador_cnpj<T> setTpInsc(String tpInsc) {
      this.tpInsc = tpInsc;
      return this;
    }

    /**
     * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado no
     * campo {ideEmpregador/tpInsc}(./tpInsc) e conforme informado em S-1000.
     *
     * @return Valor do campo nrInsc
     */
    public String getNrInsc() {
      return this.nrInsc;
    }

    /**
     * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado no
     * campo {ideEmpregador/tpInsc}(./tpInsc) e conforme informado em S-1000.
     *
     * @param nrInsc Valor para atribuir ao campo nrInsc
     * @return O próprio T_ideEmpregador_cnpj para continuar populando outros campos
     */
    public T_ideEmpregador_cnpj<T> setNrInsc(String nrInsc) {
      this.nrInsc = nrInsc;
      return this;
    }

    public T_ideEmpregador_cnpj(Object pai) {
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

  /**
   * Novo período de validade das informações.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "iniValid",
        "fimValid",
      })
  public static class T_novaValidade<T> {

    /**
     * Preencher com o mês e ano de início da validade das informações prestadas no evento, no
     * formato AAAA-MM.
     */
    private String iniValid;

    /** Preencher com o mês e ano de término da validade das informações, se houver. */
    private String fimValid;

    /**
     * Preencher com o mês e ano de início da validade das informações prestadas no evento, no
     * formato AAAA-MM.
     *
     * @return Valor do campo iniValid
     */
    public String getIniValid() {
      return this.iniValid;
    }

    /**
     * Preencher com o mês e ano de início da validade das informações prestadas no evento, no
     * formato AAAA-MM.
     *
     * <p>Validação: Deve ser uma data válida, igual ou posterior à data de início de
     * obrigatoriedade deste evento para o empregador no eSocial, no formato AAAA-MM.
     *
     * @param iniValid Valor para atribuir ao campo iniValid
     * @return O próprio T_novaValidade para continuar populando outros campos
     */
    public T_novaValidade<T> setIniValid(String iniValid) {
      this.iniValid = iniValid;
      return this;
    }

    /**
     * Preencher com o mês e ano de término da validade das informações, se houver.
     *
     * @return Valor do campo fimValid
     */
    public String getFimValid() {
      return this.fimValid;
    }

    /**
     * Preencher com o mês e ano de término da validade das informações, se houver.
     *
     * <p>Validação: Se informado, deve estar no formato AAAA-MM e ser um período igual ou posterior
     * a {iniValid}(./iniValid).
     *
     * @param fimValid Valor para atribuir ao campo fimValid
     * @return O próprio T_novaValidade para continuar populando outros campos
     */
    public T_novaValidade<T> setFimValid(String fimValid) {
      this.fimValid = fimValid;
      return this;
    }

    public T_novaValidade(Object pai) {
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

  /**
   * Informações sobre a existência de processos judiciais do trabalhador
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "tpTrib",
        "nrProcJud",
        "codSusp",
      })
  public static class T_procJudTrab<T> {

    /** Abrangência da decisão. */
    private String tpTrib;

    /**
     * Informar um número de processo judicial cadastrado através do evento S-1070, cujo
     * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) seja igual a [1].
     */
    private String nrProcJud;

    /** Código do indicativo da suspensão, atribuído pelo empregador em S-1070. */
    private Integer codSusp;

    /**
     * Abrangência da decisão.
     *
     * @return Valor do campo tpTrib
     */
    public String getTpTrib() {
      return this.tpTrib;
    }

    /**
     * Abrangência da decisão.
     *
     * @param tpTrib Valor para atribuir ao campo tpTrib
     * @return O próprio T_procJudTrab para continuar populando outros campos
     */
    public T_procJudTrab<T> setTpTrib(String tpTrib) {
      this.tpTrib = tpTrib;
      return this;
    }

    /**
     * Informar um número de processo judicial cadastrado através do evento S-1070, cujo
     * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) seja igual a [1].
     *
     * @return Valor do campo nrProcJud
     */
    public String getNrProcJud() {
      return this.nrProcJud;
    }

    /**
     * Informar um número de processo judicial cadastrado através do evento S-1070, cujo
     * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) seja igual a [1].
     *
     * <p>Validação: Deve ser um número de processo judicial válido e existente na Tabela de
     * Processos (S-1070), com {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) = [1].
     *
     * @param nrProcJud Valor para atribuir ao campo nrProcJud
     * @return O próprio T_procJudTrab para continuar populando outros campos
     */
    public T_procJudTrab<T> setNrProcJud(String nrProcJud) {
      this.nrProcJud = nrProcJud;
      return this;
    }

    /**
     * Código do indicativo da suspensão, atribuído pelo empregador em S-1070.
     *
     * @return Valor do campo codSusp
     */
    public Integer getCodSusp() {
      return this.codSusp;
    }

    /**
     * Código do indicativo da suspensão, atribuído pelo empregador em S-1070.
     *
     * <p>Validação: A informação prestada deve estar de acordo com o que foi informado em S-1070.
     *
     * @param codSusp Valor para atribuir ao campo codSusp
     * @return O próprio T_procJudTrab para continuar populando outros campos
     */
    public T_procJudTrab<T> setCodSusp(Integer codSusp) {
      this.codSusp = codSusp;
      return this;
    }

    public T_procJudTrab(Object pai) {
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

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "dia",
      })
  public static class T_infoInterm<T> {

    /** Dia do mês efetivamente trabalhado pelo empregado com contrato de trabalho intermitente. */
    private String dia;

    /**
     * Dia do mês efetivamente trabalhado pelo empregado com contrato de trabalho intermitente.
     *
     * @return Valor do campo dia
     */
    public String getDia() {
      return this.dia;
    }

    /**
     * Dia do mês efetivamente trabalhado pelo empregado com contrato de trabalho intermitente.
     *
     * <p>Validação: Deve ser um número entre 1 e 31, de acordo com o calendário anual.
     *
     * @param dia Valor para atribuir ao campo dia
     * @return O próprio T_infoInterm para continuar populando outros campos
     */
    public T_infoInterm<T> setDia(String dia) {
      this.dia = dia;
      return this;
    }

    public T_infoInterm(Object pai) {
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

  /**
   * Itens da remuneração do trabalhador
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "codRubr",
        "ideTabRubr",
        "qtdRubr",
        "fatorRubr",
        "vrRubr",
        "indApurIR",
      })
  public static class T_itensRemun_rpps<T> {

    /**
     * Informar o código atribuído pelo empregador que identifica a rubrica em sua folha de
     * pagamento.
     */
    private String codRubr;

    /**
     * Preencher com o identificador da Tabela de Rubricas para a rubrica definida em
     * {codRubr}(./codRubr).
     */
    private String ideTabRubr;

    /** Informar a quantidade de referência para apuração (em horas, cotas, meses, etc.). */
    private Double qtdRubr;

    /** Informar o fator, percentual, etc. da rubrica, quando necessário. */
    private Double fatorRubr;

    /** Valor total da rubrica. */
    private Double vrRubr;

    /** Indicativo de tipo de apuração de IR. */
    private String indApurIR;

    /**
     * Informar o código atribuído pelo empregador que identifica a rubrica em sua folha de
     * pagamento.
     *
     * @return Valor do campo codRubr
     */
    public String getCodRubr() {
      return this.codRubr;
    }

    /**
     * Informar o código atribuído pelo empregador que identifica a rubrica em sua folha de
     * pagamento.
     *
     * @param codRubr Valor para atribuir ao campo codRubr
     * @return O próprio T_itensRemun_rpps para continuar populando outros campos
     */
    public T_itensRemun_rpps<T> setCodRubr(String codRubr) {
      this.codRubr = codRubr;
      return this;
    }

    /**
     * Preencher com o identificador da Tabela de Rubricas para a rubrica definida em
     * {codRubr}(./codRubr).
     *
     * @return Valor do campo ideTabRubr
     */
    public String getIdeTabRubr() {
      return this.ideTabRubr;
    }

    /**
     * Preencher com o identificador da Tabela de Rubricas para a rubrica definida em
     * {codRubr}(./codRubr).
     *
     * @param ideTabRubr Valor para atribuir ao campo ideTabRubr
     * @return O próprio T_itensRemun_rpps para continuar populando outros campos
     */
    public T_itensRemun_rpps<T> setIdeTabRubr(String ideTabRubr) {
      this.ideTabRubr = ideTabRubr;
      return this;
    }

    /**
     * Informar a quantidade de referência para apuração (em horas, cotas, meses, etc.).
     *
     * @return Valor do campo qtdRubr
     */
    public Double getQtdRubr() {
      return this.qtdRubr;
    }

    /**
     * Informar a quantidade de referência para apuração (em horas, cotas, meses, etc.).
     *
     * <p>Preenchimento obrigatório quando se tratar de rubrica relativa a faltas ou Descanso
     * Semanal Remunerado - DSR sobre faltas (nesse caso, informar a quantidade de dias).
     *
     * <p>Validação: Deve ser maior que 0 (zero). Informação obrigatória se {codRubr}(./codRubr)
     * tiver {natRubr}(1010_infoRubrica_inclusao_dadosRubrica_natRubr) em S-1010 igual a [9207,
     * 9211].
     *
     * @param qtdRubr Valor para atribuir ao campo qtdRubr
     * @return O próprio T_itensRemun_rpps para continuar populando outros campos
     */
    public T_itensRemun_rpps<T> setQtdRubr(Double qtdRubr) {
      this.qtdRubr = qtdRubr;
      return this;
    }

    /**
     * Informar o fator, percentual, etc. da rubrica, quando necessário.
     *
     * @return Valor do campo fatorRubr
     */
    public Double getFatorRubr() {
      return this.fatorRubr;
    }

    /**
     * Informar o fator, percentual, etc. da rubrica, quando necessário.
     *
     * <p>Validação: Deve ser maior que 0 (zero).
     *
     * @param fatorRubr Valor para atribuir ao campo fatorRubr
     * @return O próprio T_itensRemun_rpps para continuar populando outros campos
     */
    public T_itensRemun_rpps<T> setFatorRubr(Double fatorRubr) {
      this.fatorRubr = fatorRubr;
      return this;
    }

    /**
     * Valor total da rubrica.
     *
     * @return Valor do campo vrRubr
     */
    public Double getVrRubr() {
      return this.vrRubr;
    }

    /**
     * Valor total da rubrica.
     *
     * <p>Validação: Deve ser maior que 0 (zero).
     *
     * @param vrRubr Valor para atribuir ao campo vrRubr
     * @return O próprio T_itensRemun_rpps para continuar populando outros campos
     */
    public T_itensRemun_rpps<T> setVrRubr(Double vrRubr) {
      this.vrRubr = vrRubr;
      return this;
    }

    /**
     * Indicativo de tipo de apuração de IR.
     *
     * @return Valor do campo indApurIR
     */
    public String getIndApurIR() {
      return this.indApurIR;
    }

    /**
     * Indicativo de tipo de apuração de IR.
     *
     * @param indApurIR Valor para atribuir ao campo indApurIR
     * @return O próprio T_itensRemun_rpps para continuar populando outros campos
     */
    public T_itensRemun_rpps<T> setIndApurIR(String indApurIR) {
      this.indApurIR = indApurIR;
      return this;
    }

    public T_itensRemun_rpps(Object pai) {
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

  /**
   * Grupo de informações do nascimento do trabalhador.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "dtNascto",
        "paisNascto",
        "paisNac",
      })
  public static class T_nascimento<T> {

    /** Preencher com a data de nascimento. */
    private javax.xml.datatype.XMLGregorianCalendar dtNascto;

    /** Preencher com o código do país de nascimento do trabalhador. */
    private String paisNascto;

    /** Preencher com o código do país de nacionalidade do trabalhador. */
    private String paisNac;

    /**
     * Preencher com a data de nascimento.
     *
     * @return Valor do campo dtNascto
     */
    public javax.xml.datatype.XMLGregorianCalendar getDtNascto() {
      return this.dtNascto;
    }

    /**
     * Preencher com a data de nascimento.
     *
     * @param dtNascto Valor para atribuir ao campo dtNascto
     * @return O próprio T_nascimento para continuar populando outros campos
     */
    public T_nascimento<T> setDtNascto(javax.xml.datatype.XMLGregorianCalendar dtNascto) {
      this.dtNascto = dtNascto;
      return this;
    }

    /**
     * Preencher com o código do país de nascimento do trabalhador.
     *
     * @return Valor do campo paisNascto
     */
    public String getPaisNascto() {
      return this.paisNascto;
    }

    /**
     * Preencher com o código do país de nascimento do trabalhador.
     *
     * <p>Validação: Deve ser um código válido e existente na Tabela 06.
     *
     * @param paisNascto Valor para atribuir ao campo paisNascto
     * @return O próprio T_nascimento para continuar populando outros campos
     */
    public T_nascimento<T> setPaisNascto(String paisNascto) {
      this.paisNascto = paisNascto;
      return this;
    }

    /**
     * Preencher com o código do país de nacionalidade do trabalhador.
     *
     * @return Valor do campo paisNac
     */
    public String getPaisNac() {
      return this.paisNac;
    }

    /**
     * Preencher com o código do país de nacionalidade do trabalhador.
     *
     * <p>Validação: Deve ser um código válido e existente na Tabela 06.
     *
     * @param paisNac Valor para atribuir ao campo paisNac
     * @return O próprio T_nascimento para continuar populando outros campos
     */
    public T_nascimento<T> setPaisNac(String paisNac) {
      this.paisNac = paisNac;
      return this;
    }

    public T_nascimento(Object pai) {
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

  /**
   * Endereço no Brasil.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "tpLograd",
        "dscLograd",
        "nrLograd",
        "complemento",
        "bairro",
        "cep",
        "codMunic",
        "uf",
      })
  public static class T_endereco_brasil<T> {

    /** Tipo de logradouro. */
    private String tpLograd;

    /** Descrição do logradouro. */
    private String dscLograd;

    /** Número do logradouro. */
    private String nrLograd;

    /** Complemento do logradouro. */
    private String complemento;

    /** Nome do bairro/distrito. */
    private String bairro;

    /** Código de Endereçamento Postal - CEP. */
    private String cep;

    /** Preencher com o código do município, conforme tabela do IBGE. */
    private Integer codMunic;

    /** Preencher com a sigla da Unidade da Federação - UF. */
    private String uf;

    /**
     * Tipo de logradouro.
     *
     * @return Valor do campo tpLograd
     */
    public String getTpLograd() {
      return this.tpLograd;
    }

    /**
     * Tipo de logradouro.
     *
     * <p>Validação: Se informado, deve ser um código válido e existente na Tabela 20.
     *
     * @param tpLograd Valor para atribuir ao campo tpLograd
     * @return O próprio T_endereco_brasil para continuar populando outros campos
     */
    public T_endereco_brasil<T> setTpLograd(String tpLograd) {
      this.tpLograd = tpLograd;
      return this;
    }

    /**
     * Descrição do logradouro.
     *
     * @return Valor do campo dscLograd
     */
    public String getDscLograd() {
      return this.dscLograd;
    }

    /**
     * Descrição do logradouro.
     *
     * @param dscLograd Valor para atribuir ao campo dscLograd
     * @return O próprio T_endereco_brasil para continuar populando outros campos
     */
    public T_endereco_brasil<T> setDscLograd(String dscLograd) {
      this.dscLograd = dscLograd;
      return this;
    }

    /**
     * Número do logradouro.
     *
     * @return Valor do campo nrLograd
     */
    public String getNrLograd() {
      return this.nrLograd;
    }

    /**
     * Número do logradouro.
     *
     * <p>Se não houver número a ser informado, preencher com "S/N".
     *
     * @param nrLograd Valor para atribuir ao campo nrLograd
     * @return O próprio T_endereco_brasil para continuar populando outros campos
     */
    public T_endereco_brasil<T> setNrLograd(String nrLograd) {
      this.nrLograd = nrLograd;
      return this;
    }

    /**
     * Complemento do logradouro.
     *
     * @return Valor do campo complemento
     */
    public String getComplemento() {
      return this.complemento;
    }

    /**
     * Complemento do logradouro.
     *
     * @param complemento Valor para atribuir ao campo complemento
     * @return O próprio T_endereco_brasil para continuar populando outros campos
     */
    public T_endereco_brasil<T> setComplemento(String complemento) {
      this.complemento = complemento;
      return this;
    }

    /**
     * Nome do bairro/distrito.
     *
     * @return Valor do campo bairro
     */
    public String getBairro() {
      return this.bairro;
    }

    /**
     * Nome do bairro/distrito.
     *
     * @param bairro Valor para atribuir ao campo bairro
     * @return O próprio T_endereco_brasil para continuar populando outros campos
     */
    public T_endereco_brasil<T> setBairro(String bairro) {
      this.bairro = bairro;
      return this;
    }

    /**
     * Código de Endereçamento Postal - CEP.
     *
     * @return Valor do campo cep
     */
    public String getCep() {
      return this.cep;
    }

    /**
     * Código de Endereçamento Postal - CEP.
     *
     * <p>Validação: Deve ser preenchido apenas com números, com 8 (oito) posições.
     *
     * @param cep Valor para atribuir ao campo cep
     * @return O próprio T_endereco_brasil para continuar populando outros campos
     */
    public T_endereco_brasil<T> setCep(String cep) {
      this.cep = cep;
      return this;
    }

    /**
     * Preencher com o código do município, conforme tabela do IBGE.
     *
     * @return Valor do campo codMunic
     */
    public Integer getCodMunic() {
      return this.codMunic;
    }

    /**
     * Preencher com o código do município, conforme tabela do IBGE.
     *
     * <p>Validação: Deve ser um código válido e existente na tabela do IBGE.
     *
     * @param codMunic Valor para atribuir ao campo codMunic
     * @return O próprio T_endereco_brasil para continuar populando outros campos
     */
    public T_endereco_brasil<T> setCodMunic(Integer codMunic) {
      this.codMunic = codMunic;
      return this;
    }

    /**
     * Preencher com a sigla da Unidade da Federação - UF.
     *
     * @return Valor do campo uf
     */
    public String getUf() {
      return this.uf;
    }

    /**
     * Preencher com a sigla da Unidade da Federação - UF.
     *
     * @param uf Valor para atribuir ao campo uf
     * @return O próprio T_endereco_brasil para continuar populando outros campos
     */
    public T_endereco_brasil<T> setUf(String uf) {
      this.uf = uf;
      return this;
    }

    public T_endereco_brasil(Object pai) {
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

  /**
   * Endereço no exterior.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "paisResid",
        "dscLograd",
        "nrLograd",
        "complemento",
        "bairro",
        "nmCid",
        "codPostal",
      })
  public static class T_endereco_exterior<T> {

    /** Preencher com o código do país. */
    private String paisResid;

    /** Descrição do logradouro. */
    private String dscLograd;

    /** Número do logradouro. */
    private String nrLograd;

    /** Complemento do logradouro. */
    private String complemento;

    /** Nome do bairro/distrito. */
    private String bairro;

    /** Nome da cidade. */
    private String nmCid;

    /** Código de Endereçamento Postal. */
    private String codPostal;

    /**
     * Preencher com o código do país.
     *
     * @return Valor do campo paisResid
     */
    public String getPaisResid() {
      return this.paisResid;
    }

    /**
     * Preencher com o código do país.
     *
     * <p>Validação: Deve ser um código válido e existente na Tabela 06.
     *
     * @param paisResid Valor para atribuir ao campo paisResid
     * @return O próprio T_endereco_exterior para continuar populando outros campos
     */
    public T_endereco_exterior<T> setPaisResid(String paisResid) {
      this.paisResid = paisResid;
      return this;
    }

    /**
     * Descrição do logradouro.
     *
     * @return Valor do campo dscLograd
     */
    public String getDscLograd() {
      return this.dscLograd;
    }

    /**
     * Descrição do logradouro.
     *
     * @param dscLograd Valor para atribuir ao campo dscLograd
     * @return O próprio T_endereco_exterior para continuar populando outros campos
     */
    public T_endereco_exterior<T> setDscLograd(String dscLograd) {
      this.dscLograd = dscLograd;
      return this;
    }

    /**
     * Número do logradouro.
     *
     * @return Valor do campo nrLograd
     */
    public String getNrLograd() {
      return this.nrLograd;
    }

    /**
     * Número do logradouro.
     *
     * <p>Se não houver número a ser informado, preencher com "S/N".
     *
     * @param nrLograd Valor para atribuir ao campo nrLograd
     * @return O próprio T_endereco_exterior para continuar populando outros campos
     */
    public T_endereco_exterior<T> setNrLograd(String nrLograd) {
      this.nrLograd = nrLograd;
      return this;
    }

    /**
     * Complemento do logradouro.
     *
     * @return Valor do campo complemento
     */
    public String getComplemento() {
      return this.complemento;
    }

    /**
     * Complemento do logradouro.
     *
     * @param complemento Valor para atribuir ao campo complemento
     * @return O próprio T_endereco_exterior para continuar populando outros campos
     */
    public T_endereco_exterior<T> setComplemento(String complemento) {
      this.complemento = complemento;
      return this;
    }

    /**
     * Nome do bairro/distrito.
     *
     * @return Valor do campo bairro
     */
    public String getBairro() {
      return this.bairro;
    }

    /**
     * Nome do bairro/distrito.
     *
     * @param bairro Valor para atribuir ao campo bairro
     * @return O próprio T_endereco_exterior para continuar populando outros campos
     */
    public T_endereco_exterior<T> setBairro(String bairro) {
      this.bairro = bairro;
      return this;
    }

    /**
     * Nome da cidade.
     *
     * @return Valor do campo nmCid
     */
    public String getNmCid() {
      return this.nmCid;
    }

    /**
     * Nome da cidade.
     *
     * @param nmCid Valor para atribuir ao campo nmCid
     * @return O próprio T_endereco_exterior para continuar populando outros campos
     */
    public T_endereco_exterior<T> setNmCid(String nmCid) {
      this.nmCid = nmCid;
      return this;
    }

    /**
     * Código de Endereçamento Postal.
     *
     * @return Valor do campo codPostal
     */
    public String getCodPostal() {
      return this.codPostal;
    }

    /**
     * Código de Endereçamento Postal.
     *
     * @param codPostal Valor para atribuir ao campo codPostal
     * @return O próprio T_endereco_exterior para continuar populando outros campos
     */
    public T_endereco_exterior<T> setCodPostal(String codPostal) {
      this.codPostal = codPostal;
      return this;
    }

    public T_endereco_exterior(Object pai) {
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

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "fonePrinc",
        "emailPrinc",
      })
  public static class T_contato<T> {

    /** Número de telefone do trabalhador, com DDD. */
    private String fonePrinc;

    /** Endereço eletrônico. */
    private String emailPrinc;

    /**
     * Número de telefone do trabalhador, com DDD.
     *
     * @return Valor do campo fonePrinc
     */
    public String getFonePrinc() {
      return this.fonePrinc;
    }

    /**
     * Número de telefone do trabalhador, com DDD.
     *
     * <p>Validação: Se preenchido, deve conter apenas números, com o mínimo de dez dígitos.
     *
     * @param fonePrinc Valor para atribuir ao campo fonePrinc
     * @return O próprio T_contato para continuar populando outros campos
     */
    public T_contato<T> setFonePrinc(String fonePrinc) {
      this.fonePrinc = fonePrinc;
      return this;
    }

    /**
     * Endereço eletrônico.
     *
     * @return Valor do campo emailPrinc
     */
    public String getEmailPrinc() {
      return this.emailPrinc;
    }

    /**
     * Endereço eletrônico.
     *
     * <p>Validação: O e-mail deve ser possuir o caractere "@" e este não pode estar no início e no
     * fim do e-mail. Deve possuir no mínimo um caractere "." depois do @ e não pode estar no início
     * ou no final do e-mail.
     *
     * @param emailPrinc Valor para atribuir ao campo emailPrinc
     * @return O próprio T_contato para continuar populando outros campos
     */
    public T_contato<T> setEmailPrinc(String emailPrinc) {
      this.emailPrinc = emailPrinc;
      return this;
    }

    public T_contato(Object pai) {
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

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "tpInsc", "nrInsc",
      })
  public static class T_aprend<T> {

    /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
    private String tpInsc;

    /**
     * Informar o número de inscrição do estabelecimento para o qual a contratação de aprendiz foi
     * efetivada, de acordo com o tipo de inscrição indicado no campo {aprend/tpInsc}(./tpInsc).
     */
    private String nrInsc;

    /**
     * Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05.
     *
     * @return Valor do campo tpInsc
     */
    public String getTpInsc() {
      return this.tpInsc;
    }

    /**
     * Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05.
     *
     * @param tpInsc Valor para atribuir ao campo tpInsc
     * @return O próprio T_aprend para continuar populando outros campos
     */
    public T_aprend<T> setTpInsc(String tpInsc) {
      this.tpInsc = tpInsc;
      return this;
    }

    /**
     * Informar o número de inscrição do estabelecimento para o qual a contratação de aprendiz foi
     * efetivada, de acordo com o tipo de inscrição indicado no campo {aprend/tpInsc}(./tpInsc).
     *
     * @return Valor do campo nrInsc
     */
    public String getNrInsc() {
      return this.nrInsc;
    }

    /**
     * Informar o número de inscrição do estabelecimento para o qual a contratação de aprendiz foi
     * efetivada, de acordo com o tipo de inscrição indicado no campo {aprend/tpInsc}(./tpInsc).
     *
     * <p>Validação: Deve ser um identificador válido e:
     *
     * <p>a) Se {aprend/tpInsc}(./tpInsc) = [1], deve ser informado com 14 (catorze) algarismos. Se
     * o empregador for pessoa jurídica, a raiz do CNPJ informado deve ser diferente de
     * {ideEmpregador/nrInsc}(/ideEmpregador_nrInsc).
     *
     * <p>b) Se {aprend/tpInsc}(./tpInsc) = [2], deve ser diferente do CPF do empregado. Se o
     * empregador for pessoa física, também deve ser diferente do CPF do empregador.
     *
     * @param nrInsc Valor para atribuir ao campo nrInsc
     * @return O próprio T_aprend para continuar populando outros campos
     */
    public T_aprend<T> setNrInsc(String nrInsc) {
      this.nrInsc = nrInsc;
      return this;
    }

    public T_aprend(Object pai) {
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

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "vrSalFx",
        "undSalFixo",
        "dscSalVar",
      })
  public static class T_remuneracao<T> {

    /** Salário base do trabalhador, correspondente à parte fixa da remuneração. */
    private Double vrSalFx;

    /** Unidade de pagamento da parte fixa da remuneração. */
    private String undSalFixo;

    /**
     * Descrição do salário por tarefa ou variável e como este é calculado. Ex.: Comissões pagas no
     * percentual de 10% sobre as vendas.
     */
    private String dscSalVar;

    /**
     * Salário base do trabalhador, correspondente à parte fixa da remuneração.
     *
     * @return Valor do campo vrSalFx
     */
    public Double getVrSalFx() {
      return this.vrSalFx;
    }

    /**
     * Salário base do trabalhador, correspondente à parte fixa da remuneração.
     *
     * <p>Validação: Se {undSalFixo}(./undSalFixo) for igual a [7], preencher com 0 (zero).
     *
     * @param vrSalFx Valor para atribuir ao campo vrSalFx
     * @return O próprio T_remuneracao para continuar populando outros campos
     */
    public T_remuneracao<T> setVrSalFx(Double vrSalFx) {
      this.vrSalFx = vrSalFx;
      return this;
    }

    /**
     * Unidade de pagamento da parte fixa da remuneração.
     *
     * @return Valor do campo undSalFixo
     */
    public String getUndSalFixo() {
      return this.undSalFixo;
    }

    /**
     * Unidade de pagamento da parte fixa da remuneração.
     *
     * @param undSalFixo Valor para atribuir ao campo undSalFixo
     * @return O próprio T_remuneracao para continuar populando outros campos
     */
    public T_remuneracao<T> setUndSalFixo(String undSalFixo) {
      this.undSalFixo = undSalFixo;
      return this;
    }

    /**
     * Descrição do salário por tarefa ou variável e como este é calculado. Ex.: Comissões pagas no
     * percentual de 10% sobre as vendas.
     *
     * @return Valor do campo dscSalVar
     */
    public String getDscSalVar() {
      return this.dscSalVar;
    }

    /**
     * Descrição do salário por tarefa ou variável e como este é calculado. Ex.: Comissões pagas no
     * percentual de 10% sobre as vendas.
     *
     * <p>Validação: Preenchimento obrigatório se {undSalFixo}(./undSalFixo) for igual a [6, 7].
     *
     * @param dscSalVar Valor para atribuir ao campo dscSalVar
     * @return O próprio T_remuneracao para continuar populando outros campos
     */
    public T_remuneracao<T> setDscSalVar(String dscSalVar) {
      this.dscSalVar = dscSalVar;
      return this;
    }

    public T_remuneracao(Object pai) {
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

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "tpInsc",
        "nrInsc",
        "descComp",
      })
  public static class T_localTrabGeral<T> {

    /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
    private String tpInsc;

    /**
     * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado no
     * campo {localTrabGeral/tpInsc}(./tpInsc).
     */
    private String nrInsc;

    /** Descrição complementar do local de trabalho. */
    private String descComp;

    /**
     * Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05.
     *
     * @return Valor do campo tpInsc
     */
    public String getTpInsc() {
      return this.tpInsc;
    }

    /**
     * Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05.
     *
     * @param tpInsc Valor para atribuir ao campo tpInsc
     * @return O próprio T_localTrabGeral para continuar populando outros campos
     */
    public T_localTrabGeral<T> setTpInsc(String tpInsc) {
      this.tpInsc = tpInsc;
      return this;
    }

    /**
     * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado no
     * campo {localTrabGeral/tpInsc}(./tpInsc).
     *
     * @return Valor do campo nrInsc
     */
    public String getNrInsc() {
      return this.nrInsc;
    }

    /**
     * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado no
     * campo {localTrabGeral/tpInsc}(./tpInsc).
     *
     * <p>Validação: Deve ser um número de inscrição válido e existente na Tabela de
     * Estabelecimentos (S-1005), bem como compatível com {localTrabGeral/tpInsc}(./tpInsc).
     *
     * @param nrInsc Valor para atribuir ao campo nrInsc
     * @return O próprio T_localTrabGeral para continuar populando outros campos
     */
    public T_localTrabGeral<T> setNrInsc(String nrInsc) {
      this.nrInsc = nrInsc;
      return this;
    }

    /**
     * Descrição complementar do local de trabalho.
     *
     * @return Valor do campo descComp
     */
    public String getDescComp() {
      return this.descComp;
    }

    /**
     * Descrição complementar do local de trabalho.
     *
     * @param descComp Valor para atribuir ao campo descComp
     * @return O próprio T_localTrabGeral para continuar populando outros campos
     */
    public T_localTrabGeral<T> setDescComp(String descComp) {
      this.descComp = descComp;
      return this;
    }

    public T_localTrabGeral(Object pai) {
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

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "qtdHrsSem",
        "tpJornada",
        "tmpParc",
        "horNoturno",
        "dscJorn",
      })
  public static class T_horContratual<T> {

    /** Quantidade média de horas relativas à jornada semanal do trabalhador. */
    private Double qtdHrsSem;

    /** Tipo de jornada. */
    private String tpJornada;

    /** Preencher com o código relativo ao tipo de contrato em tempo parcial. */
    private String tmpParc;

    /** Indicar se a jornada semanal possui horário noturno (no todo ou em parte). */
    private String horNoturno;

    /**
     * Descrição da jornada semanal contratual, contendo os dias da semana e os respectivos horários
     * contratuais (entrada, saída e intervalos).
     */
    private String dscJorn;

    /**
     * Quantidade média de horas relativas à jornada semanal do trabalhador.
     *
     * @return Valor do campo qtdHrsSem
     */
    public Double getQtdHrsSem() {
      return this.qtdHrsSem;
    }

    /**
     * Quantidade média de horas relativas à jornada semanal do trabalhador.
     *
     * <p>Validação: Deve ser preenchida se {codCateg}(../codCateg) for diferente de [111]. Se
     * informada, deve ser maior que 0 (zero).
     *
     * @param qtdHrsSem Valor para atribuir ao campo qtdHrsSem
     * @return O próprio T_horContratual para continuar populando outros campos
     */
    public T_horContratual<T> setQtdHrsSem(Double qtdHrsSem) {
      this.qtdHrsSem = qtdHrsSem;
      return this;
    }

    /**
     * Tipo de jornada.
     *
     * @return Valor do campo tpJornada
     */
    public String getTpJornada() {
      return this.tpJornada;
    }

    /**
     * Tipo de jornada.
     *
     * @param tpJornada Valor para atribuir ao campo tpJornada
     * @return O próprio T_horContratual para continuar populando outros campos
     */
    public T_horContratual<T> setTpJornada(String tpJornada) {
      this.tpJornada = tpJornada;
      return this;
    }

    /**
     * Preencher com o código relativo ao tipo de contrato em tempo parcial.
     *
     * @return Valor do campo tmpParc
     */
    public String getTmpParc() {
      return this.tmpParc;
    }

    /**
     * Preencher com o código relativo ao tipo de contrato em tempo parcial.
     *
     * <p>Validação: O código [1] só é válido se {codCateg}(../codCateg) = [104]. Os códigos [2, 3]
     * não são válidos se {codCateg}(../codCateg) = [104].
     *
     * @param tmpParc Valor para atribuir ao campo tmpParc
     * @return O próprio T_horContratual para continuar populando outros campos
     */
    public T_horContratual<T> setTmpParc(String tmpParc) {
      this.tmpParc = tmpParc;
      return this;
    }

    /**
     * Indicar se a jornada semanal possui horário noturno (no todo ou em parte).
     *
     * @return Valor do campo horNoturno
     */
    public String getHorNoturno() {
      return this.horNoturno;
    }

    /**
     * Indicar se a jornada semanal possui horário noturno (no todo ou em parte).
     *
     * @param horNoturno Valor para atribuir ao campo horNoturno
     * @return O próprio T_horContratual para continuar populando outros campos
     */
    public T_horContratual<T> setHorNoturno(String horNoturno) {
      this.horNoturno = horNoturno;
      return this;
    }

    /**
     * Descrição da jornada semanal contratual, contendo os dias da semana e os respectivos horários
     * contratuais (entrada, saída e intervalos).
     *
     * @return Valor do campo dscJorn
     */
    public String getDscJorn() {
      return this.dscJorn;
    }

    /**
     * Descrição da jornada semanal contratual, contendo os dias da semana e os respectivos horários
     * contratuais (entrada, saída e intervalos).
     *
     * @param dscJorn Valor para atribuir ao campo dscJorn
     * @return O próprio T_horContratual para continuar populando outros campos
     */
    public T_horContratual<T> setDscJorn(String dscJorn) {
      this.dscJorn = dscJorn;
      return this;
    }

    public T_horContratual(Object pai) {
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

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "nrProcJud",
      })
  public static class T_alvaraJudicial<T> {

    /** Preencher com o número do processo judicial. */
    private String nrProcJud;

    /**
     * Preencher com o número do processo judicial.
     *
     * @return Valor do campo nrProcJud
     */
    public String getNrProcJud() {
      return this.nrProcJud;
    }

    /**
     * Preencher com o número do processo judicial.
     *
     * <p>Validação: Deve ser um número de processo judicial válido.
     *
     * @param nrProcJud Valor para atribuir ao campo nrProcJud
     * @return O próprio T_alvaraJudicial para continuar populando outros campos
     */
    public T_alvaraJudicial<T> setNrProcJud(String nrProcJud) {
      this.nrProcJud = nrProcJud;
      return this;
    }

    public T_alvaraJudicial(Object pai) {
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

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "codTreiCap",
      })
  public static class T_treiCap<T> {

    /**
     * Informar o código do treinamento, capacitação, exercício simulado ou outra anotação, conforme
     * Tabela 28.
     */
    private Integer codTreiCap;

    /**
     * Informar o código do treinamento, capacitação, exercício simulado ou outra anotação, conforme
     * Tabela 28.
     *
     * @return Valor do campo codTreiCap
     */
    public Integer getCodTreiCap() {
      return this.codTreiCap;
    }

    /**
     * Informar o código do treinamento, capacitação, exercício simulado ou outra anotação, conforme
     * Tabela 28.
     *
     * <p>Validação: Deve ser um código válido e existente na Tabela 28.
     *
     * @param codTreiCap Valor para atribuir ao campo codTreiCap
     * @return O próprio T_treiCap para continuar populando outros campos
     */
    public T_treiCap<T> setCodTreiCap(Integer codTreiCap) {
      this.codTreiCap = codTreiCap;
      return this;
    }

    public T_treiCap(Object pai) {
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

  /**
   * Informações de identificação do trabalhador e do vínculo.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "cpfTrab",
        "matricula",
      })
  public static class T_ideVinculo<T> {

    /** Preencher com o número do CPF do trabalhador. */
    private String cpfTrab;

    /**
     * Matrícula atribuída ao trabalhador pela empresa ou, no caso de servidor público, a matrícula
     * constante no Sistema de Administração de Recursos Humanos do órgão.
     */
    private String matricula;

    /**
     * Preencher com o número do CPF do trabalhador.
     *
     * @return Valor do campo cpfTrab
     */
    public String getCpfTrab() {
      return this.cpfTrab;
    }

    /**
     * Preencher com o número do CPF do trabalhador.
     *
     * @param cpfTrab Valor para atribuir ao campo cpfTrab
     * @return O próprio T_ideVinculo para continuar populando outros campos
     */
    public T_ideVinculo<T> setCpfTrab(String cpfTrab) {
      this.cpfTrab = cpfTrab;
      return this;
    }

    /**
     * Matrícula atribuída ao trabalhador pela empresa ou, no caso de servidor público, a matrícula
     * constante no Sistema de Administração de Recursos Humanos do órgão.
     *
     * @return Valor do campo matricula
     */
    public String getMatricula() {
      return this.matricula;
    }

    /**
     * Matrícula atribuída ao trabalhador pela empresa ou, no caso de servidor público, a matrícula
     * constante no Sistema de Administração de Recursos Humanos do órgão.
     *
     * <p>Validação: Deve corresponder à matrícula informada pelo empregador no evento S-2200 do
     * respectivo vínculo trabalhista.
     *
     * @param matricula Valor para atribuir ao campo matricula
     * @return O próprio T_ideVinculo para continuar populando outros campos
     */
    public T_ideVinculo<T> setMatricula(String matricula) {
      this.matricula = matricula;
      return this;
    }

    public T_ideVinculo(Object pai) {
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

  /**
   * Informações de identificação do trabalhador e do vínculo.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "cpfTrab",
        "matricula",
        "codCateg",
      })
  public static class T_ideVinculo_sst<T> {

    /** Preencher com o número do CPF do trabalhador. */
    private String cpfTrab;

    /**
     * Matrícula atribuída ao trabalhador pela empresa ou, no caso de servidor público, a matrícula
     * constante no Sistema de Administração de Recursos Humanos do órgão.
     */
    private String matricula;

    /** Preencher com o código da categoria do trabalhador. */
    private Integer codCateg;

    /**
     * Preencher com o número do CPF do trabalhador.
     *
     * @return Valor do campo cpfTrab
     */
    public String getCpfTrab() {
      return this.cpfTrab;
    }

    /**
     * Preencher com o número do CPF do trabalhador.
     *
     * @param cpfTrab Valor para atribuir ao campo cpfTrab
     * @return O próprio T_ideVinculo_sst para continuar populando outros campos
     */
    public T_ideVinculo_sst<T> setCpfTrab(String cpfTrab) {
      this.cpfTrab = cpfTrab;
      return this;
    }

    /**
     * Matrícula atribuída ao trabalhador pela empresa ou, no caso de servidor público, a matrícula
     * constante no Sistema de Administração de Recursos Humanos do órgão.
     *
     * @return Valor do campo matricula
     */
    public String getMatricula() {
      return this.matricula;
    }

    /**
     * Matrícula atribuída ao trabalhador pela empresa ou, no caso de servidor público, a matrícula
     * constante no Sistema de Administração de Recursos Humanos do órgão.
     *
     * <p>Validação: Deve corresponder à matrícula informada pelo empregador no evento S-2190,
     * S-2200 ou S-2300 do respectivo contrato. Não preencher no caso de Trabalhador Sem Vínculo de
     * Emprego/Estatutário - TSVE sem informação de matrícula no evento S-2300.
     *
     * @param matricula Valor para atribuir ao campo matricula
     * @return O próprio T_ideVinculo_sst para continuar populando outros campos
     */
    public T_ideVinculo_sst<T> setMatricula(String matricula) {
      this.matricula = matricula;
      return this;
    }

    /**
     * Preencher com o código da categoria do trabalhador.
     *
     * @return Valor do campo codCateg
     */
    public Integer getCodCateg() {
      return this.codCateg;
    }

    /**
     * Preencher com o código da categoria do trabalhador.
     *
     * <p>Informar somente no caso de TSVE sem informação de matrícula no evento S-2300.
     *
     * <p>Validação: Informação obrigatória e exclusiva se não houver preenchimento de
     * {matricula}(./matricula). Se informado, deve ser um código válido e existente na Tabela 01.
     *
     * @param codCateg Valor para atribuir ao campo codCateg
     * @return O próprio T_ideVinculo_sst para continuar populando outros campos
     */
    public T_ideVinculo_sst<T> setCodCateg(Integer codCateg) {
      this.codCateg = codCateg;
      return this;
    }

    public T_ideVinculo_sst(Object pai) {
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

  /**
   * Identificação do TSVE
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "cpfTrab",
        "matricula",
        "codCateg",
      })
  public static class T_ideTrabSemVinculo<T> {

    /** Preencher com o número do CPF do trabalhador. */
    private String cpfTrab;

    /** Matrícula atribuída ao trabalhador pela empresa. */
    private String matricula;

    /** Preencher com o código da categoria do trabalhador. */
    private Integer codCateg;

    /**
     * Preencher com o número do CPF do trabalhador.
     *
     * @return Valor do campo cpfTrab
     */
    public String getCpfTrab() {
      return this.cpfTrab;
    }

    /**
     * Preencher com o número do CPF do trabalhador.
     *
     * @param cpfTrab Valor para atribuir ao campo cpfTrab
     * @return O próprio T_ideTrabSemVinculo para continuar populando outros campos
     */
    public T_ideTrabSemVinculo<T> setCpfTrab(String cpfTrab) {
      this.cpfTrab = cpfTrab;
      return this;
    }

    /**
     * Matrícula atribuída ao trabalhador pela empresa.
     *
     * @return Valor do campo matricula
     */
    public String getMatricula() {
      return this.matricula;
    }

    /**
     * Matrícula atribuída ao trabalhador pela empresa.
     *
     * <p>Validação: Deve corresponder à matrícula informada pelo empregador no evento S-2300 do
     * respectivo contrato. Não preencher no caso de TSVE sem informação de matrícula no evento
     * S-2300.
     *
     * @param matricula Valor para atribuir ao campo matricula
     * @return O próprio T_ideTrabSemVinculo para continuar populando outros campos
     */
    public T_ideTrabSemVinculo<T> setMatricula(String matricula) {
      this.matricula = matricula;
      return this;
    }

    /**
     * Preencher com o código da categoria do trabalhador.
     *
     * @return Valor do campo codCateg
     */
    public Integer getCodCateg() {
      return this.codCateg;
    }

    /**
     * Preencher com o código da categoria do trabalhador.
     *
     * <p>Informar somente no caso de TSVE sem informação de matrícula no evento S-2300.
     *
     * <p>Validação: Informação obrigatória e exclusiva se não houver preenchimento de
     * {matricula}(./matricula). Se informado, deve ser um código válido e existente na Tabela 01.
     *
     * @param codCateg Valor para atribuir ao campo codCateg
     * @return O próprio T_ideTrabSemVinculo para continuar populando outros campos
     */
    public T_ideTrabSemVinculo<T> setCodCateg(Integer codCateg) {
      this.codCateg = codCateg;
      return this;
    }

    public T_ideTrabSemVinculo(Object pai) {
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

  /**
   * Informação relativa a empresas do Simples
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "indSimples",
      })
  public static class T_infoSimples<T> {

    /** Indicador de contribuição substituída. */
    private String indSimples;

    /**
     * Indicador de contribuição substituída.
     *
     * @return Valor do campo indSimples
     */
    public String getIndSimples() {
      return this.indSimples;
    }

    /**
     * Indicador de contribuição substituída.
     *
     * @param indSimples Valor para atribuir ao campo indSimples
     * @return O próprio T_infoSimples para continuar populando outros campos
     */
    public T_infoSimples<T> setIndSimples(String indSimples) {
      this.indSimples = indSimples;
      return this;
    }

    public T_infoSimples(Object pai) {
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

  /**
   * Informação de múltiplos vínculos
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "indMV",
        "remunOutrEmpr",
      })
  public static class T_infoMV<T> {

    /** Indicador de desconto da contribuição previdenciária do trabalhador. */
    private String indMV;

    /** Remuneração recebida pelo trabalhador em outras empresas ou atividades */
    private RemunOutrEmpr remunOutrEmpr;

    /**
     * Indicador de desconto da contribuição previdenciária do trabalhador.
     *
     * @return Valor do campo indMV
     */
    public String getIndMV() {
      return this.indMV;
    }

    /**
     * Indicador de desconto da contribuição previdenciária do trabalhador.
     *
     * @param indMV Valor para atribuir ao campo indMV
     * @return O próprio T_infoMV para continuar populando outros campos
     */
    public T_infoMV<T> setIndMV(String indMV) {
      this.indMV = indMV;
      return this;
    }

    /**
     * Remuneração recebida pelo trabalhador em outras empresas ou atividades
     *
     * @return Valor do campo remunOutrEmpr
     */
    public RemunOutrEmpr getRemunOutrEmpr() {
      return this.remunOutrEmpr;
    }

    /**
     * Remuneração recebida pelo trabalhador em outras empresas ou atividades
     *
     * <p>DESCRICAO_COMPLETA:Informações relativas ao trabalhador que possui vínculo empregatício
     * com outra(s) empresa(s) e/ou que exerce outras atividades como contribuinte individual,
     * detalhando as empresas que efetuaram (ou efetuarão) desconto da contribuição.
     *
     * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}, {codCateg}
     *
     * @return O objeto RemunOutrEmpr para população dos campos filhos
     */
    public RemunOutrEmpr<T_infoMV<T>> setRemunOutrEmpr() {
      if (this.remunOutrEmpr == null) {
        this.remunOutrEmpr = new RemunOutrEmpr(this);
      }
      return this.remunOutrEmpr;
    }

    public T_infoMV(Object pai) {
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
     * Remuneração recebida pelo trabalhador em outras empresas ou atividades
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "tpInsc",
          "nrInsc",
          "codCateg",
          "vlrRemunOE",
        })
    public static class RemunOutrEmpr<T> {

      /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
      private String tpInsc;

      /**
       * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado
       * no campo {remunOutrEmpr/tpInsc}(./tpInsc).
       */
      private String nrInsc;

      /** Preencher com o código da categoria do trabalhador na qual houve a remuneração. */
      private Integer codCateg;

      /**
       * Preencher com o valor da remuneração recebida pelo trabalhador na outra empresa/atividade,
       * sobre a qual houve desconto/recolhimento da contribuição do segurado.
       */
      private Double vlrRemunOE;

      /**
       * Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05.
       *
       * @return Valor do campo tpInsc
       */
      public String getTpInsc() {
        return this.tpInsc;
      }

      /**
       * Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05.
       *
       * @param tpInsc Valor para atribuir ao campo tpInsc
       * @return O próprio RemunOutrEmpr para continuar populando outros campos
       */
      public RemunOutrEmpr<T> setTpInsc(String tpInsc) {
        this.tpInsc = tpInsc;
        return this;
      }

      /**
       * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado
       * no campo {remunOutrEmpr/tpInsc}(./tpInsc).
       *
       * @return Valor do campo nrInsc
       */
      public String getNrInsc() {
        return this.nrInsc;
      }

      /**
       * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado
       * no campo {remunOutrEmpr/tpInsc}(./tpInsc).
       *
       * <p>Validação: a) Se {remunOutrEmpr/tpInsc}(./tpInsc) = [1], deve ser um CNPJ válido,
       * diferente do CNPJ base indicado no evento de Informações do Empregador (S-1000) e dos
       * estabelecimentos informados através do evento S-1005.
       *
       * <p>b) Se {remunOutrEmpr/tpInsc}(./tpInsc) = [2], deve ser um CPF válido e diferente do CPF
       * do trabalhador e ainda, caso o empregador seja pessoa física, diferente do CPF do
       * empregador.
       *
       * @param nrInsc Valor para atribuir ao campo nrInsc
       * @return O próprio RemunOutrEmpr para continuar populando outros campos
       */
      public RemunOutrEmpr<T> setNrInsc(String nrInsc) {
        this.nrInsc = nrInsc;
        return this;
      }

      /**
       * Preencher com o código da categoria do trabalhador na qual houve a remuneração.
       *
       * @return Valor do campo codCateg
       */
      public Integer getCodCateg() {
        return this.codCateg;
      }

      /**
       * Preencher com o código da categoria do trabalhador na qual houve a remuneração.
       *
       * <p>Validação: Deve ser um código válido e existente na Tabela 01.
       *
       * @param codCateg Valor para atribuir ao campo codCateg
       * @return O próprio RemunOutrEmpr para continuar populando outros campos
       */
      public RemunOutrEmpr<T> setCodCateg(Integer codCateg) {
        this.codCateg = codCateg;
        return this;
      }

      /**
       * Preencher com o valor da remuneração recebida pelo trabalhador na outra empresa/atividade,
       * sobre a qual houve desconto/recolhimento da contribuição do segurado.
       *
       * @return Valor do campo vlrRemunOE
       */
      public Double getVlrRemunOE() {
        return this.vlrRemunOE;
      }

      /**
       * Preencher com o valor da remuneração recebida pelo trabalhador na outra empresa/atividade,
       * sobre a qual houve desconto/recolhimento da contribuição do segurado.
       *
       * <p>Validação: Deve ser maior que 0 (zero).
       *
       * @param vlrRemunOE Valor para atribuir ao campo vlrRemunOE
       * @return O próprio RemunOutrEmpr para continuar populando outros campos
       */
      public RemunOutrEmpr<T> setVlrRemunOE(Double vlrRemunOE) {
        this.vlrRemunOE = vlrRemunOE;
        return this;
      }

      public RemunOutrEmpr(Object pai) {
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

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "natEstagio",
        "nivEstagio",
        "areaAtuacao",
        "nrApol",
        "dtPrevTerm",
        "instEnsino",
        "ageIntegracao",
        "supervisorEstagio",
      })
  public static class T_infoEstagiario<T> {

    /** Natureza do estágio. */
    private String natEstagio;

    /** Informar o nível do estágio. */
    private String nivEstagio;

    /** Área de atuação do estagiário. */
    private String areaAtuacao;

    /** Número da apólice de seguro. */
    private String nrApol;

    /** Data prevista para o término do estágio. */
    private javax.xml.datatype.XMLGregorianCalendar dtPrevTerm;

    /** Instituição de ensino. */
    private InstEnsino instEnsino;

    /** Agente de integração. */
    private AgeIntegracao ageIntegracao;

    /** Supervisor do estágio. */
    private SupervisorEstagio supervisorEstagio;

    /**
     * Natureza do estágio.
     *
     * @return Valor do campo natEstagio
     */
    public String getNatEstagio() {
      return this.natEstagio;
    }

    /**
     * Natureza do estágio.
     *
     * @param natEstagio Valor para atribuir ao campo natEstagio
     * @return O próprio T_infoEstagiario para continuar populando outros campos
     */
    public T_infoEstagiario<T> setNatEstagio(String natEstagio) {
      this.natEstagio = natEstagio;
      return this;
    }

    /**
     * Informar o nível do estágio.
     *
     * @return Valor do campo nivEstagio
     */
    public String getNivEstagio() {
      return this.nivEstagio;
    }

    /**
     * Informar o nível do estágio.
     *
     * @param nivEstagio Valor para atribuir ao campo nivEstagio
     * @return O próprio T_infoEstagiario para continuar populando outros campos
     */
    public T_infoEstagiario<T> setNivEstagio(String nivEstagio) {
      this.nivEstagio = nivEstagio;
      return this;
    }

    /**
     * Área de atuação do estagiário.
     *
     * @return Valor do campo areaAtuacao
     */
    public String getAreaAtuacao() {
      return this.areaAtuacao;
    }

    /**
     * Área de atuação do estagiário.
     *
     * @param areaAtuacao Valor para atribuir ao campo areaAtuacao
     * @return O próprio T_infoEstagiario para continuar populando outros campos
     */
    public T_infoEstagiario<T> setAreaAtuacao(String areaAtuacao) {
      this.areaAtuacao = areaAtuacao;
      return this;
    }

    /**
     * Número da apólice de seguro.
     *
     * @return Valor do campo nrApol
     */
    public String getNrApol() {
      return this.nrApol;
    }

    /**
     * Número da apólice de seguro.
     *
     * @param nrApol Valor para atribuir ao campo nrApol
     * @return O próprio T_infoEstagiario para continuar populando outros campos
     */
    public T_infoEstagiario<T> setNrApol(String nrApol) {
      this.nrApol = nrApol;
      return this;
    }

    /**
     * Data prevista para o término do estágio.
     *
     * @return Valor do campo dtPrevTerm
     */
    public javax.xml.datatype.XMLGregorianCalendar getDtPrevTerm() {
      return this.dtPrevTerm;
    }

    /**
     * Data prevista para o término do estágio.
     *
     * <p>Validação: Deve ser uma data posterior à data de início do estágio.
     *
     * @param dtPrevTerm Valor para atribuir ao campo dtPrevTerm
     * @return O próprio T_infoEstagiario para continuar populando outros campos
     */
    public T_infoEstagiario<T> setDtPrevTerm(javax.xml.datatype.XMLGregorianCalendar dtPrevTerm) {
      this.dtPrevTerm = dtPrevTerm;
      return this;
    }

    /**
     * Instituição de ensino.
     *
     * @return Valor do campo instEnsino
     */
    public InstEnsino getInstEnsino() {
      return this.instEnsino;
    }

    /**
     * Instituição de ensino.
     *
     * @return O objeto InstEnsino para população dos campos filhos
     */
    public InstEnsino<T_infoEstagiario<T>> setInstEnsino() {
      if (this.instEnsino == null) {
        this.instEnsino = new InstEnsino(this);
      }
      return this.instEnsino;
    }

    /**
     * Agente de integração.
     *
     * @return Valor do campo ageIntegracao
     */
    public AgeIntegracao getAgeIntegracao() {
      return this.ageIntegracao;
    }

    /**
     * Agente de integração.
     *
     * <p>CONDICAO_GRUPO: OC
     *
     * @return O objeto AgeIntegracao para população dos campos filhos
     */
    public AgeIntegracao<T_infoEstagiario<T>> setAgeIntegracao() {
      if (this.ageIntegracao == null) {
        this.ageIntegracao = new AgeIntegracao(this);
      }
      return this.ageIntegracao;
    }

    /**
     * Supervisor do estágio.
     *
     * @return Valor do campo supervisorEstagio
     */
    public SupervisorEstagio getSupervisorEstagio() {
      return this.supervisorEstagio;
    }

    /**
     * Supervisor do estágio.
     *
     * <p>CONDICAO_GRUPO: OC
     *
     * @return O objeto SupervisorEstagio para população dos campos filhos
     */
    public SupervisorEstagio<T_infoEstagiario<T>> setSupervisorEstagio() {
      if (this.supervisorEstagio == null) {
        this.supervisorEstagio = new SupervisorEstagio(this);
      }
      return this.supervisorEstagio;
    }

    public T_infoEstagiario(Object pai) {
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
     * Instituição de ensino.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "cnpjInstEnsino",
          "nmRazao",
          "dscLograd",
          "nrLograd",
          "bairro",
          "cep",
          "codMunic",
          "uf",
        })
    public static class InstEnsino<T> {

      /**
       * Preencher com o CNPJ da instituição de ensino. Deve ser preenchido apenas se a instituição
       * de ensino for brasileira.
       */
      private String cnpjInstEnsino;

      /** Informar a razão social. */
      private String nmRazao;

      /** Descrição do logradouro. */
      private String dscLograd;

      /** Número do logradouro. */
      private String nrLograd;

      /** Nome do bairro/distrito. */
      private String bairro;

      /** Código de Endereçamento Postal - CEP. */
      private String cep;

      /** Preencher com o código do município, conforme tabela do IBGE. */
      private Integer codMunic;

      /** Preencher com a sigla da Unidade da Federação - UF. */
      private String uf;

      /**
       * Preencher com o CNPJ da instituição de ensino. Deve ser preenchido apenas se a instituição
       * de ensino for brasileira.
       *
       * @return Valor do campo cnpjInstEnsino
       */
      public String getCnpjInstEnsino() {
        return this.cnpjInstEnsino;
      }

      /**
       * Preencher com o CNPJ da instituição de ensino. Deve ser preenchido apenas se a instituição
       * de ensino for brasileira.
       *
       * <p>Validação: Se informado, deve ser um CNPJ válido, com 14 (catorze) algarismos.
       *
       * @param cnpjInstEnsino Valor para atribuir ao campo cnpjInstEnsino
       * @return O próprio InstEnsino para continuar populando outros campos
       */
      public InstEnsino<T> setCnpjInstEnsino(String cnpjInstEnsino) {
        this.cnpjInstEnsino = cnpjInstEnsino;
        return this;
      }

      /**
       * Informar a razão social.
       *
       * @return Valor do campo nmRazao
       */
      public String getNmRazao() {
        return this.nmRazao;
      }

      /**
       * Informar a razão social.
       *
       * <p>Validação: Preenchimento obrigatório e exclusivo se o campo
       * {cnpjInstEnsino}(./cnpjInstEnsino) não estiver preenchido.
       *
       * @param nmRazao Valor para atribuir ao campo nmRazao
       * @return O próprio InstEnsino para continuar populando outros campos
       */
      public InstEnsino<T> setNmRazao(String nmRazao) {
        this.nmRazao = nmRazao;
        return this;
      }

      /**
       * Descrição do logradouro.
       *
       * @return Valor do campo dscLograd
       */
      public String getDscLograd() {
        return this.dscLograd;
      }

      /**
       * Descrição do logradouro.
       *
       * <p>Validação: Preenchimento obrigatório e exclusivo se o campo
       * {cnpjInstEnsino}(./cnpjInstEnsino) não estiver preenchido.
       *
       * @param dscLograd Valor para atribuir ao campo dscLograd
       * @return O próprio InstEnsino para continuar populando outros campos
       */
      public InstEnsino<T> setDscLograd(String dscLograd) {
        this.dscLograd = dscLograd;
        return this;
      }

      /**
       * Número do logradouro.
       *
       * @return Valor do campo nrLograd
       */
      public String getNrLograd() {
        return this.nrLograd;
      }

      /**
       * Número do logradouro.
       *
       * <p>Se não houver número a ser informado, preencher com "S/N".
       *
       * <p>Validação: Preenchimento obrigatório e exclusivo se o campo
       * {cnpjInstEnsino}(./cnpjInstEnsino) não estiver preenchido.
       *
       * @param nrLograd Valor para atribuir ao campo nrLograd
       * @return O próprio InstEnsino para continuar populando outros campos
       */
      public InstEnsino<T> setNrLograd(String nrLograd) {
        this.nrLograd = nrLograd;
        return this;
      }

      /**
       * Nome do bairro/distrito.
       *
       * @return Valor do campo bairro
       */
      public String getBairro() {
        return this.bairro;
      }

      /**
       * Nome do bairro/distrito.
       *
       * <p>Validação: Preenchimento obrigatório e exclusivo se o campo
       * {cnpjInstEnsino}(./cnpjInstEnsino) não estiver preenchido.
       *
       * @param bairro Valor para atribuir ao campo bairro
       * @return O próprio InstEnsino para continuar populando outros campos
       */
      public InstEnsino<T> setBairro(String bairro) {
        this.bairro = bairro;
        return this;
      }

      /**
       * Código de Endereçamento Postal - CEP.
       *
       * @return Valor do campo cep
       */
      public String getCep() {
        return this.cep;
      }

      /**
       * Código de Endereçamento Postal - CEP.
       *
       * <p>Validação: Não informar se o campo {cnpjInstEnsino}(./cnpjInstEnsino) estiver
       * preenchido. Se informado, deve ser preenchido apenas com números, com 8 (oito) posições.
       *
       * @param cep Valor para atribuir ao campo cep
       * @return O próprio InstEnsino para continuar populando outros campos
       */
      public InstEnsino<T> setCep(String cep) {
        this.cep = cep;
        return this;
      }

      /**
       * Preencher com o código do município, conforme tabela do IBGE.
       *
       * @return Valor do campo codMunic
       */
      public Integer getCodMunic() {
        return this.codMunic;
      }

      /**
       * Preencher com o código do município, conforme tabela do IBGE.
       *
       * <p>Validação: Não informar se o campo {cnpjInstEnsino}(./cnpjInstEnsino) estiver
       * preenchido. Se informado, deve ser um código válido e existente na tabela do IBGE.
       *
       * @param codMunic Valor para atribuir ao campo codMunic
       * @return O próprio InstEnsino para continuar populando outros campos
       */
      public InstEnsino<T> setCodMunic(Integer codMunic) {
        this.codMunic = codMunic;
        return this;
      }

      /**
       * Preencher com a sigla da Unidade da Federação - UF.
       *
       * @return Valor do campo uf
       */
      public String getUf() {
        return this.uf;
      }

      /**
       * Preencher com a sigla da Unidade da Federação - UF.
       *
       * <p>Validação: Não informar se o campo {cnpjInstEnsino}(./cnpjInstEnsino) estiver
       * preenchido.
       *
       * @param uf Valor para atribuir ao campo uf
       * @return O próprio InstEnsino para continuar populando outros campos
       */
      public InstEnsino<T> setUf(String uf) {
        this.uf = uf;
        return this;
      }

      public InstEnsino(Object pai) {
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

    /**
     * Agente de integração.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "cnpjAgntInteg",
        })
    public static class AgeIntegracao<T> {

      /** CNPJ do agente de integração. */
      private String cnpjAgntInteg;

      /**
       * CNPJ do agente de integração.
       *
       * @return Valor do campo cnpjAgntInteg
       */
      public String getCnpjAgntInteg() {
        return this.cnpjAgntInteg;
      }

      /**
       * CNPJ do agente de integração.
       *
       * <p>Validação: Deve ser um CNPJ válido, com 14 (catorze) algarismos.
       *
       * @param cnpjAgntInteg Valor para atribuir ao campo cnpjAgntInteg
       * @return O próprio AgeIntegracao para continuar populando outros campos
       */
      public AgeIntegracao<T> setCnpjAgntInteg(String cnpjAgntInteg) {
        this.cnpjAgntInteg = cnpjAgntInteg;
        return this;
      }

      public AgeIntegracao(Object pai) {
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

    /**
     * Supervisor do estágio.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "cpfSupervisor",
        })
    public static class SupervisorEstagio<T> {

      /** CPF do responsável pela supervisão do estagiário. */
      private String cpfSupervisor;

      /**
       * CPF do responsável pela supervisão do estagiário.
       *
       * @return Valor do campo cpfSupervisor
       */
      public String getCpfSupervisor() {
        return this.cpfSupervisor;
      }

      /**
       * CPF do responsável pela supervisão do estagiário.
       *
       * <p>Validação: Deve ser um CPF válido.
       *
       * @param cpfSupervisor Valor para atribuir ao campo cpfSupervisor
       * @return O próprio SupervisorEstagio para continuar populando outros campos
       */
      public SupervisorEstagio<T> setCpfSupervisor(String cpfSupervisor) {
        this.cpfSupervisor = cpfSupervisor;
        return this;
      }

      public SupervisorEstagio(Object pai) {
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

  /**
   * Identificação do beneficiário e do benefício.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "cpfBenef",
        "nrBeneficio",
      })
  public static class T_ideBeneficio<T> {

    /** Informar o CPF do beneficiário. */
    private String cpfBenef;

    /** Número do benefício. */
    private String nrBeneficio;

    /**
     * Informar o CPF do beneficiário.
     *
     * @return Valor do campo cpfBenef
     */
    public String getCpfBenef() {
      return this.cpfBenef;
    }

    /**
     * Informar o CPF do beneficiário.
     *
     * @param cpfBenef Valor para atribuir ao campo cpfBenef
     * @return O próprio T_ideBeneficio para continuar populando outros campos
     */
    public T_ideBeneficio<T> setCpfBenef(String cpfBenef) {
      this.cpfBenef = cpfBenef;
      return this;
    }

    /**
     * Número do benefício.
     *
     * @return Valor do campo nrBeneficio
     */
    public String getNrBeneficio() {
      return this.nrBeneficio;
    }

    /**
     * Número do benefício.
     *
     * @param nrBeneficio Valor para atribuir ao campo nrBeneficio
     * @return O próprio T_ideBeneficio para continuar populando outros campos
     */
    public T_ideBeneficio<T> setNrBeneficio(String nrBeneficio) {
      this.nrBeneficio = nrBeneficio;
      return this;
    }

    public T_ideBeneficio(Object pai) {
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

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "tpInsc",
        "nrInsc",
        "matricAnt",
        "dtAdm",
      })
  public static class T_sucessaoVinc<T> {

    /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
    private String tpInsc;

    /**
     * Informar o número de inscrição do empregador anterior, de acordo com o tipo de inscrição
     * indicado no campo {sucessaoVinc/tpInsc}(./tpInsc).
     */
    private String nrInsc;

    /** Matrícula do trabalhador no empregador anterior. */
    private String matricAnt;

    /**
     * Preencher com a data de admissão do trabalhador. No caso de transferência do empregado, deve
     * ser preenchida a data inicial do vínculo no primeiro empregador (data de início do vínculo).
     */
    private javax.xml.datatype.XMLGregorianCalendar dtAdm;

    /**
     * Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05.
     *
     * @return Valor do campo tpInsc
     */
    public String getTpInsc() {
      return this.tpInsc;
    }

    /**
     * Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05.
     *
     * @param tpInsc Valor para atribuir ao campo tpInsc
     * @return O próprio T_sucessaoVinc para continuar populando outros campos
     */
    public T_sucessaoVinc<T> setTpInsc(String tpInsc) {
      this.tpInsc = tpInsc;
      return this;
    }

    /**
     * Informar o número de inscrição do empregador anterior, de acordo com o tipo de inscrição
     * indicado no campo {sucessaoVinc/tpInsc}(./tpInsc).
     *
     * @return Valor do campo nrInsc
     */
    public String getNrInsc() {
      return this.nrInsc;
    }

    /**
     * Informar o número de inscrição do empregador anterior, de acordo com o tipo de inscrição
     * indicado no campo {sucessaoVinc/tpInsc}(./tpInsc).
     *
     * @param nrInsc Valor para atribuir ao campo nrInsc
     * @return O próprio T_sucessaoVinc para continuar populando outros campos
     */
    public T_sucessaoVinc<T> setNrInsc(String nrInsc) {
      this.nrInsc = nrInsc;
      return this;
    }

    /**
     * Matrícula do trabalhador no empregador anterior.
     *
     * @return Valor do campo matricAnt
     */
    public String getMatricAnt() {
      return this.matricAnt;
    }

    /**
     * Matrícula do trabalhador no empregador anterior.
     *
     * @param matricAnt Valor para atribuir ao campo matricAnt
     * @return O próprio T_sucessaoVinc para continuar populando outros campos
     */
    public T_sucessaoVinc<T> setMatricAnt(String matricAnt) {
      this.matricAnt = matricAnt;
      return this;
    }

    /**
     * Preencher com a data de admissão do trabalhador. No caso de transferência do empregado, deve
     * ser preenchida a data inicial do vínculo no primeiro empregador (data de início do vínculo).
     *
     * @return Valor do campo dtAdm
     */
    public javax.xml.datatype.XMLGregorianCalendar getDtAdm() {
      return this.dtAdm;
    }

    /**
     * Preencher com a data de admissão do trabalhador. No caso de transferência do empregado, deve
     * ser preenchida a data inicial do vínculo no primeiro empregador (data de início do vínculo).
     *
     * @param dtAdm Valor para atribuir ao campo dtAdm
     * @return O próprio T_sucessaoVinc para continuar populando outros campos
     */
    public T_sucessaoVinc<T> setDtAdm(javax.xml.datatype.XMLGregorianCalendar dtAdm) {
      this.dtAdm = dtAdm;
      return this;
    }

    public T_sucessaoVinc(Object pai) {
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
