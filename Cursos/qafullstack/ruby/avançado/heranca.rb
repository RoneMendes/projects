class Veiculo
    attr_accessor :nome, :marca, :modelo

    #construtor
    def initialize(nome, marca, modelo)
        self.nome = nome
        self.marca = marca
        self.modelo = modelo
    end

    def ligar
        puts "#{nome} está pronto para iniciar o trajeto"
    end

    def buzinar
        puts 'Beep! Beep!'
    end
end

#classes filha
class Carro <Veiculo
    def dirigir
        puts "#{nome} iniciando trajeto." 
    end
end

class Moto <Veiculo
    def pilotar
        puts "#{nome} iniciando trajeto"
    end
end

civic = Carro.new('Civic', 'Honda', 'SI')
civic.ligar
civic.buzinar
civic.dirigir

lancer = Carro.new('Lancer', 'Mitsubishi', 'EVO')
lancer.ligar
lancer.buzinar
lancer.dirigir

fazer = Moto.new('Fazer','Yamaha','250x')
fazer.ligar
fazer.buzinar
fazer.pilotar