import axios from 'axios'
import { toast } from 'react-toastify'
import icon from '../../assets/img/notification-icon.svg'
import { BASE_URL } from '../../Utils/request'
import './style.css'

type Props = {
  saleId: number
}

function hendleClik(id: number) {
  axios(`${BASE_URL}/Sales/${id}/Notification`).then(response => {
    toast.info("SMS enviado com sucesso")
  })
}

function NotificationButton({ saleId }: Props) {
  return (
    <>
      <div className="dsmeta-red-btn" onClick={() => hendleClik(saleId)}>
        <img src={icon} alt="Notificar" />
      </div>
    </>
  )
}

export default NotificationButton
